package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.model.*;
import com.ctacorp.syndication.client.sdk.*;
import com.ctacorp.syndication.client.sdk.MediaType;
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
    public void testGetMediaOnlyAudio() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.AUDIO));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Audio> audios = mediaItemDeserializer.getMediaByType(Audio.class);
        for (Audio audio : audios) {
            System.out.println(audio);
        }
    }

    @Test
    public void testGetMediaOnlyCollections() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.COLLECTION));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Collection> collections = mediaItemDeserializer.getMediaByType(Collection.class);
        for (Collection collection : collections) {
            System.out.println(collection);
        }
    }

    @Test
    public void testGetMediaOnlyHtmls() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.HTML));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Html> htmls = mediaItemDeserializer.getMediaByType(Html.class);
        for (Html html : htmls) {
            System.out.println(html);
        }
    }

    @Test
    public void testGetMediaOnlyImages() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.IMAGE));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Image> images = mediaItemDeserializer.getMediaByType(Image.class);
        for (Image image : images) {
            System.out.println(image);
        }
    }

    @Test
    public void testGetMediaOnlyInfographics() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.INFOGRAPHIC));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Infographic> infographics = mediaItemDeserializer.getMediaByType(Infographic.class);
        for (Infographic infographic : infographics) {
            System.out.println(infographic);
        }
    }

    @Test
    public void testGetMediaOnlySocialMedia() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.SOCIALMEDIA));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<SocialMedia> socialMedias = mediaItemDeserializer.getMediaByType(SocialMedia.class);
        for (SocialMedia socialMedia : socialMedias) {
            System.out.println(socialMedia);
        }
    }

    @Test
    public void testGetMediaOnlyVideo() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.VIDEO));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Video> videos = mediaItemDeserializer.getMediaByType(Video.class);
        for (Video video : videos) {
            System.out.println(video);
        }
    }

    @Test
    public void testGetMediaOnlyWidgets() throws Exception {

        MediaItems mediaItems = new ResourcesApi().getMedia(new GetMediaRequest(MediaType.WIDGET));
        assertNotNull(mediaItems);

        Meta meta = mediaItems.getMeta();
        assertEquals(200, meta.getStatus().longValue());

        MediaItemDeserializer mediaItemDeserializer = new MediaItemDeserializer(mediaItems.getRaw());
        List<Widget> widgets = mediaItemDeserializer.getMediaByType(Widget.class);
        for (Widget widget : widgets) {
            System.out.println(widget);
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
