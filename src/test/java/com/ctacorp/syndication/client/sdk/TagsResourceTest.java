package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.*;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TagsResourceTest {

    @Test
    public void testGetTagTypes() throws Exception {

        TagTypes tagTypes = new ResourcesApi().getTagTypes();
        assertNotNull(tagTypes);

        Meta meta = tagTypes.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<TagType> results = tagTypes.getResults();
        for(TagType tagType : results) {
            System.out.println(tagType);
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGetTags() throws Exception {

        GetTagsRequest request = new GetTagsRequest();
        request.setName("Heart Disease");

        TagLists tagLists = new ResourcesApi().getTags(request);
        assertNotNull(tagLists);

        Meta meta = tagLists.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Map> tagListsResults = tagLists.getResults();
        List<Tag> tags = ParsingUtils.getTagsFromTagLists(tagListsResults);
        for(Tag tag : tags) {
            System.out.println(tag);
        }
    }

    @Test
    public void testGetTagById() throws Exception {

        Tags tags = new ResourcesApi().getTagById(1l);
        assertNotNull(tags);

        Meta meta = tags.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Tag> results = tags.getResults();
        assertEquals(1, results.size());

        Tag tag = results.get(0);
        System.out.println(tag);
    }

    @Test
    public void testGetMediaByTagId() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMediaByTagId(1l);
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for(MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }

    @Test
    public void testGetRelatedTagsById() throws Exception {

        TagLists tagLists = new ResourcesApi().getRelatedTagsById(1l);
        assertNotNull(tagLists);

        Meta meta = tagLists.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Map> tagListsResults = tagLists.getResults();
        List<Tag> tags = ParsingUtils.getTagsFromTagLists(tagListsResults);
        for(Tag tag : tags) {
            System.out.println(tag);
        }
    }
}
