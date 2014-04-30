package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.common.ApiException;
import com.ctacorp.syndication.client.model.Campaign;
import com.ctacorp.syndication.client.model.Campaigns;
import com.ctacorp.syndication.client.sdk.ResourcesApi;
import com.ctacorp.syndication.client.sdk.Pagination;

import java.util.List;
import org.junit.Test;

public class ReadmeExample {

    @Test
    public void testIt() {

        ResourcesApi resourcesApi = new ResourcesApi();

        resourcesApi.setBasePath("http://ctacdev.com:8090/Syndication/api/v2");

        Pagination pagination = new Pagination();
        pagination.setMax(10);
        pagination.setSort("ASC");
        pagination.setOffset(0);
        resourcesApi.setPagination(pagination);

        try {

            Campaigns campaigns = resourcesApi.getCampaigns();
            List<Campaign> results = campaigns.getResults();

            for (Campaign campaign : results) {
                System.out.println(campaign);
            }

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
