package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.MediaType;
import com.ctacorp.syndication.client.model.MediaTypes;
import com.ctacorp.syndication.client.model.Meta;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MediaTypesResourceTest {

    @Test
    public void testGetMediaTypes() throws Exception {

        MediaTypes mediaTypes = new ResourcesApi().getMediaTypes();
        assertNotNull(mediaTypes);

        Meta meta = mediaTypes.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<MediaType> results = mediaTypes.getResults();
        for (MediaType mediaType : results) {
            System.out.println(mediaType);
        }
    }
}
