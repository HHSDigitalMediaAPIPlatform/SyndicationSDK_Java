package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.common.ApiInvoker;
import com.ctacorp.syndication.client.model.MediaItem;
import com.ctacorp.syndication.client.model.MediaItems;
import com.ctacorp.syndication.client.model.Tag;
import com.ctacorp.syndication.client.model.TagLists;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.*;

public class ResourceDeserializer {

    private Map<String, List<Object>> mediaItemLists = new HashMap<String, List<Object>>();

    public ResourceDeserializer() throws Exception {
    }

    public ResourceDeserializer(String raw) throws Exception {
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
            return createTypedListMap(jsonArray);
        } else {
            if (jsonObj != null) {
                if (!jsonObj.containsKey("results")) {
                    throw new IllegalArgumentException("Could not find a 'results' node");
                } else {
                    Object o = jsonObj.get("results");
                    if (o instanceof JSONObject) {
                        throw new IllegalArgumentException("Expected a JSONArray at this node");
                    }
                    return createTypedListMap((JSONArray) o);
                }
            }
        }

        return new HashMap<String, List<Object>>();
    }

    private Map<String, List<Object>> createTypedListMap(JSONArray jsonArray) throws Exception {

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
    public <T> List<T> getResourceByType(Class<T> clazz) {
        List objects = mediaItemLists.get(clazz.getSimpleName());
        if(objects==null) {
            objects = new ArrayList<T>();
        }
        return Collections.checkedList(objects, clazz);
    }

    @SuppressWarnings("unchecked")
    public static List<Tag> getTagsFromTagLists(TagLists tagLists) {

        List<Map> tagListsResults = tagLists.getResults();

        List<Tag> allTags = new ArrayList<Tag>();

        for(Map tagList : tagListsResults) {
            List<Map> tags = (List<Map>) tagList.get("Topic");
            if(tags!=null) {
                for(Map tagMap : tags) {

                    Tag tag = new Tag();
                    tag.setId(Long.valueOf(tagMap.get("id").toString()));
                    tag.setLanguage((String) tagMap.get("language"));
                    tag.setName((String) tagMap.get("name"));
                    tag.setType((String) tagMap.get("type"));

                    allTags.add(tag);
                }
            }
        }

        return allTags;
    }
}
