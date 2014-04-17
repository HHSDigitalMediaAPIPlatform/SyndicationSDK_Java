package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CampaignsResourceTest {

    @Test
    public void testGetCampaigns() throws Exception {

        Campaigns campaigns = new ResourcesApi().getCampaigns();
        assertNotNull(campaigns);

        Meta meta = campaigns.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Campaign> results = campaigns.getResults();
        for(Campaign campaign : results) {
            System.out.println(campaign);
        }
    }

    @Test
    public void testGetCampaign() throws Exception {

        Campaigns campaigns = new ResourcesApi().getCampaignById(1l);
        assertNotNull(campaigns);

        Meta meta = campaigns.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Campaign> results = campaigns.getResults();
        assertEquals(1, results.size());

        Campaign campaign = results.get(0);
        System.out.println(campaign);
    }

    @Test
    public void testGetMediaByCampaignId() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMediaByCampaignId(1l);
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for(MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }
}
