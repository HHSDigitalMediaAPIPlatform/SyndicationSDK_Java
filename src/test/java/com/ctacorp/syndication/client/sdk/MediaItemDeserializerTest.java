package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.*;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class MediaItemDeserializerTest {

    @Test
    public void testInitUsingEmptyJson() throws Exception {

        try {
            new MediaItemDeserializer().init("{}");
        } catch (Exception e) {
            assertEquals("Could not find a 'results' node", e.getMessage());
        }
    }

    @Test
    public void testInitUsingEmptyArray() throws Exception {

        Map<String, List<Object>> mediaItems = new MediaItemDeserializer().init("[]");
        assertEquals(0, mediaItems.size());
    }

    @Test
    public void testInitUsingNullResults() throws Exception {

        Map<String, List<Object>> mediaItems = new MediaItemDeserializer().init("{\"results\":null}");
        assertEquals(0, mediaItems.size());
    }

    @Test
    public void testInitUsingEmptyResults() throws Exception {

        Map<String, List<Object>> mediaItems = new MediaItemDeserializer().init("{\"results\":[]}");
        assertEquals(0, mediaItems.size());
    }

    @Test
    public void testInitUsingNonMediaItem() throws Exception {

        Map<String, List<Object>> mediaItems = new MediaItemDeserializer().init("{\"results\":[{}]}");
        assertEquals(1, mediaItems.size());
    }

    @Test
    public void testInitUsingImages() throws Exception {

        String json = IOUtils.toString(new ClassPathResource("image_results.json").getInputStream());

        MediaItemDeserializer converter = new MediaItemDeserializer();
        converter.init(json);

        List<Image> images = converter.getMediaByType(Image.class);
        assertEquals(20, images.size());
    }

    @Test
    public void testInitUsingAllTypes() throws Exception {

        String json = IOUtils.toString(new ClassPathResource("all_media.json").getInputStream());

        MediaItemDeserializer converter = new MediaItemDeserializer();
        converter.init(json);

        List<MediaItem> mediaItems = converter.getMediaByType(MediaItem.class);
        assertEquals(0, mediaItems.size());

        List<Image> images = converter.getMediaByType(Image.class);
        assertEquals(24, images.size());

        List<Video> videos = converter.getMediaByType(Video.class);
        assertEquals(15, videos.size());

        List<Audio> audios = converter.getMediaByType(Audio.class);
        assertEquals(0, audios.size());

        List<Collection> collections = converter.getMediaByType(Collection.class);
        assertEquals(3, collections.size());

        List<Html> htmls = converter.getMediaByType(Html.class);
        assertEquals(41, htmls.size());

        List<Infographic> infographics = converter.getMediaByType(Infographic.class);
        assertEquals(1, infographics.size());

        List<SocialMedia> socialMedias = converter.getMediaByType(SocialMedia.class);
        assertEquals(0, socialMedias.size());

        List<Widget> widgets = converter.getMediaByType(Widget.class);
        assertEquals(0, widgets.size());
    }
}
