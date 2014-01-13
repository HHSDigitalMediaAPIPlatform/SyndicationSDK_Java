package com.ctacorp.syndication.sdk.jsonparsing;

import com.ctacorp.syndication.sdk.syndicationdatastructure.Campaign;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 12:54 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawCampaignResponse extends RawApiResponse{
    public Campaign[] results;
}
