package com.ctacorp.syndication.sdk.jsonparsing;

import com.ctacorp.syndication.sdk.syndicationdatastructure.Tag;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/14/14
 * Time: 11:26 AM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawTagResponse extends RawApiResponse {
    public Tag[] results;
}
