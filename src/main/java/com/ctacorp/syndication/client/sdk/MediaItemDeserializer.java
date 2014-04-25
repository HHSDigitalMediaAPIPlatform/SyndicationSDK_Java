package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.common.ApiInvoker;
import com.ctacorp.syndication.client.model.MediaItem;
import com.ctacorp.syndication.client.model.MediaItems;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.*;

public class MediaItemDeserializer {

    private Map<String, List<Object>> mediaItemLists = new HashMap<String, List<Object>>();

    public MediaItemDeserializer() throws Exception {
    }

    public MediaItemDeserializer(String raw) throws Exception {
        init(raw);
    }

    public Map<String, List<Object>> init(MediaItems mediaItems) throws Exception {
        String raw = mediaItems.getRaw();
        return init(raw);
    }

    public Map<String, List<Object>> init(String raw) throws Exception {

        JSONParser jsonParser = new JSONParser();
        Object rootObj = jsonParser.parse(raw);

        JSONObject jsonObj = null;
        JSONArray jsonArray = null;

        if (rootObj instanceof JSONObject) {
            jsonObj = (JSONObject) rootObj;
        } else {
            jsonArray = (JSONArray) rootObj;
        }

        if (jsonArray != null) {
            return doTheThing(jsonArray);
        } else {
            if (jsonObj != null) {
                if (!jsonObj.containsKey("results")) {
                    throw new IllegalArgumentException("Could not find a 'results' node");
                } else {
                    Object o = jsonObj.get("results");
                    if (o instanceof JSONObject) {
                        throw new IllegalArgumentException("Expected a JSONArray at this node");
                    }
                    return doTheThing((JSONArray) o);
                }
            }
        }

        return new HashMap<String, List<Object>>();
    }

    private Map<String, List<Object>> doTheThing(JSONArray jsonArray) throws Exception {

        Map<String,List<Object>> mediaItemLists = new HashMap<String, List<Object>>();

        if(jsonArray==null) {
            return mediaItemLists;
        }

        for (Object o : jsonArray) {
            if (o instanceof JSONArray) {
                throw new IllegalArgumentException("Expected a JSONObject at this node");
            } else {
                JSONObject jsonObject = (JSONObject) o;

                if(jsonObject.containsKey("mediaType")) {
                    String mediaType = (String) jsonObject.get("mediaType");
                    Object object = ApiInvoker.deserialize(jsonObject.toJSONString(), null, Class.forName("com.ctacorp.syndication.client.model." + mediaType));
                    if(!mediaItemLists.containsKey(mediaType)) {
                        mediaItemLists.put(mediaType, new ArrayList<Object>());
                    }
                    mediaItemLists.get(mediaType).add(object);
                } else {
                    MediaItem object = (MediaItem) ApiInvoker.deserialize(jsonObject.toJSONString(), null, MediaItem.class);
                    String mediaItemClassName = "MediaItem";
                    if(!mediaItemLists.containsKey(mediaItemClassName)) {
                        mediaItemLists.put(mediaItemClassName, new ArrayList<Object>());
                    }
                    mediaItemLists.get(mediaItemClassName).add(object);
                }
            }
        }

        this.mediaItemLists = mediaItemLists;

        return mediaItemLists;
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> getMediaByType(Class<T> clazz) {
        List objects = mediaItemLists.get(clazz.getSimpleName());
        if(objects==null) {
            objects = new ArrayList<T>();
        }
        return Collections.checkedList(objects, clazz);
    }
}
