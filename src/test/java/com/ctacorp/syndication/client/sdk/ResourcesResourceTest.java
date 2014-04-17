package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.Meta;
import com.ctacorp.syndication.client.model.Resources;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ResourcesResourceTest {

    @Test
    public void testGetTagTypes() throws Exception {

        Resources resources = new ResourcesApi().getResources("health");
        assertNotNull(resources);

        Meta meta = resources.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Map> results = resources.getResults();
        for (Map result : results) {
            System.out.println(result);
        }
    }
}
