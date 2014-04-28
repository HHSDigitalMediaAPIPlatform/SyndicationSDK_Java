package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.model.MediaItems;
import com.ctacorp.syndication.client.model.Video;
import com.ctacorp.syndication.client.sdk.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class PaginationTest {

    @Test
    public void testGetVideosUsingPagniation() throws Exception {

        ResourcesApi resourcesApi = new ResourcesApi();

        MediaItems repsonse1 = resourcesApi.getMedia(new GetMediaRequest(MediaType.VIDEO), new Pagination(5,1,"-name,id"));
        List<Video> page1 = new ResourceDeserializer(repsonse1.getRaw()).getResourceByType(Video.class);
        assertEquals(5, page1.size());

        for (Video video : page1) {
            System.out.println(video);
        }

        MediaItems repsonse2 = resourcesApi.getMedia(new GetMediaRequest(MediaType.VIDEO), new Pagination(5,5,"-name,id"));
        List<Video> page2 = new ResourceDeserializer(repsonse2.getRaw()).getResourceByType(Video.class);
        assertEquals(5, page2.size());

        for (Video video : page2) {
            System.out.println(video);
        }
    }
}
