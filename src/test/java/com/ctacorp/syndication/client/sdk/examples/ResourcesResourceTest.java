package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.model.*;
import com.ctacorp.syndication.client.sdk.ResourcesApi;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ResourcesResourceTest {

    @Test
    public void testGetResources() throws Exception {

        Resources resources = new ResourcesApi().getResources("health");
        assertNotNull(resources);

        Meta meta = resources.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<ResourceLists> results = resources.getResults();
        assertEquals(1, results.size());
        ResourceLists resourceLists = results.get(0);

        ResourceList audios = resourceLists.getAudios();
        System.out.println(audios);

        ResourceList alternateImages = resourceLists.getAlternateImages();
        System.out.println(alternateImages);

        ResourceList campaigns = resourceLists.getCampaigns();
        System.out.println(campaigns);

        ResourceList collections = resourceLists.getCollections();
        System.out.println(collections);

        ResourceList htmls = resourceLists.getHtmls();
        System.out.println(htmls);

        ResourceList images = resourceLists.getImages();
        System.out.println(images);

        ResourceList infographics = resourceLists.getInfographics();
        System.out.println(infographics);

        ResourceList languages = resourceLists.getLanguages();
        System.out.println(languages);

        ResourceList socialMedias = resourceLists.getSocialMedias();
        System.out.println(socialMedias);

        ResourceList sources = resourceLists.getSources();
        System.out.println(sources);

        ResourceList tags = resourceLists.getTags();
        System.out.println(tags);

        ResourceList tagTypes = resourceLists.getTagTypes();
        System.out.println(tagTypes);

        ResourceList videos = resourceLists.getVideos();
        System.out.println(videos);

        ResourceList widgets = resourceLists.getWidgets();
        System.out.println(widgets);
    }

    @Test
    public void testGetVideoResources() throws Exception {

        Resources resources = new ResourcesApi().getResources("health");
        assertNotNull(resources);

        Meta meta = resources.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<ResourceLists> results = resources.getResults();
        assertEquals(1, results.size());
        ResourceLists resourceLists = results.get(0);

        ResourceList videoResourceList = resourceLists.getVideos();
        assertEquals("Video", videoResourceList.getMediaType());
        List<Resource> videos = videoResourceList.getItems();
        for (Resource video : videos) {
            System.out.println(video);
        }
    }
}
