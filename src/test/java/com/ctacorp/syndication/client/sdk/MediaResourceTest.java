package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.MediaItem;
import com.ctacorp.syndication.client.model.MediaItems;
import com.ctacorp.syndication.client.model.Meta;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MediaResourceTest {

    @Test
    public void testGetCampaigns() throws Exception {

        MediaItems campaigns = new ResourcesApi().getMedia(new GetMediaRequest());
        assertNotNull(campaigns);

        Meta meta = campaigns.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<MediaItem> results = campaigns.getResults();
        for(MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }
}
