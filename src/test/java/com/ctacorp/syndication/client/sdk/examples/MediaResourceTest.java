package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.model.*;
import com.ctacorp.syndication.client.sdk.*;
import com.ctacorp.syndication.client.sdk.Pagination;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MediaResourceTest {

    @Test
    public void testGetMedia() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest());
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for (MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }

    @Test
    public void testGetMostPopularMediaItems() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMostPopularMediaItems();
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for (MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }

    @Test
    public void testSearchMedia() throws Exception {

        MediaItems mediaItems = new ResourcesApi().searchMedia("health");
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for (MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }

    @Test
    public void testGetMediaById() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMediaById(1l);
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for (MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }

    @Test
    public void testGetMediaContentById() throws Exception {

        String content = new ResourcesApi().getMediaContentById(1l);
        assertNotNull(content);

        System.out.println(content);
    }

    @Test
    public void testGetMediaPreviewById() throws Exception {

        ImageProperties imageProperties = new ImageProperties();
        imageProperties.setHeight(100);

        String content = new ResourcesApi().getMediaPreviewById(1l, imageProperties);
        assertNotNull(content);
    }

    @Test
    public void testGetMediaEmbedById() throws Exception {

        EmbedCode embedCode = new ResourcesApi().getMediaEmbedById(1l);
        assertNotNull(embedCode);

        Meta meta = embedCode.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<Snippet> results = embedCode.getResults();
        for (Snippet snippet : results) {
            System.out.println(snippet.getSnippet());
        }
    }

    @Test
    public void testGetMediaRatingsById() throws Exception {

        Ratings embedCode = new ResourcesApi().getMediaRatingsById(1l);
        assertNotNull(embedCode);

        Meta meta = embedCode.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<Likes> results = embedCode.getResults();
        for (Likes likes : results) {
            System.out.println(likes.getLikes());
        }
    }

    @Test
    public void testGetRelatedMediaById() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getRelatedMediaById(1l);
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<MediaItem> results = mediaItems.getResults();
        for (MediaItem mediaItem : results) {
            System.out.println(mediaItem);
        }
    }

    @Test
    public void testGetMediaSyndicateById() throws Exception {

        SyndicatedMediaItems syndicate = new ResourcesApi().getMediaSyndicateById(42l);
        assertNotNull(syndicate);

        Meta meta = syndicate.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<SyndicatedMediaItem> results = syndicate.getResults();
        for (SyndicatedMediaItem media : results) {
            System.out.println(media);
        }
    }

    @Test
    public void testGetMediaYoutubeMetaDataById() throws Exception {

        YoutubeMetadata youtubeMetaData = new ResourcesApi().getMediaYoutubeMetaDataById(66l);
        assertNotNull(youtubeMetaData);

        Meta meta = youtubeMetaData.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        List<Map> results = youtubeMetaData.getResults();
        for (Map result : results) {
            System.out.println(result);
        }
    }
}
