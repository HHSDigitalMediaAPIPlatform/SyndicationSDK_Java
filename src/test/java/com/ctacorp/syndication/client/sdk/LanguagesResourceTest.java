package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.model.Language;
import com.ctacorp.syndication.client.model.Languages;
import com.ctacorp.syndication.client.model.Meta;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LanguagesResourceTest {

    @Test
    public void testGetLanguages() throws Exception {

        Languages languages = new ResourcesApi().getLanguages();
        assertNotNull(languages);

        Meta meta = languages.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Language> results = languages.getResults();
        for(Language language : results) {
            System.out.println(language);
        }
    }

    @Test
    public void testGetLanguage() throws Exception {

        Languages languages = new ResourcesApi().getLanguageById(1l);
        assertNotNull(languages);

        Meta meta = languages.getMeta();
        assertEquals(200,meta.getStatus().longValue());

        List<Language> results = languages.getResults();
        assertEquals(1, results.size());

        Language language = results.get(0);
        System.out.println(language);
    }
}
