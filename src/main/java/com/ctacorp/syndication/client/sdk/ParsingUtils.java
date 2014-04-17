package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParsingUtils {

    @SuppressWarnings("unchecked")
    public static List<Tag> getTagsFromTagLists(List<Map> tagListsResults) {

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
