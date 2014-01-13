package com.ctacorp.syndication.sdk.jsonparsing;

import com.ctacorp.syndication.sdk.syndicationdatastructure.MediaType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 11:29 AM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawMediaTypeResponse extends RawApiResponse {
    public MediaType[] results;
}
