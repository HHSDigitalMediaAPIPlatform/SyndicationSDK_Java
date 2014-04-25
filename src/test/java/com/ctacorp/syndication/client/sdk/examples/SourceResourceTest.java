package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.model.Meta;
import com.ctacorp.syndication.client.model.Source;
import com.ctacorp.syndication.client.model.Sources;
import com.ctacorp.syndication.client.sdk.ResourcesApi;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SourceResourceTest {

    @Test
    public void testGetSources() throws Exception {

        Sources sources = new ResourcesApi().getSources();
        assertNotNull(sources);

        Meta meta = sources.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Source> results = sources.getResults();
        for(Source source : results) {
            System.out.println(source);
        }
    }

    @Test
    public void testGetSourceById() throws Exception {

        Sources sources = new ResourcesApi().getSourceById(1l);
        assertNotNull(sources);

        Meta meta = sources.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Source> results = sources.getResults();
        assertEquals(1, results.size());

        Source source = results.get(0);
        System.out.println(source);
    }
}
