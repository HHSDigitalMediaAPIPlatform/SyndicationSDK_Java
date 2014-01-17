package com.ctacorp.syndication.sdk.jsonparsing;

import com.ctacorp.syndication.sdk.syndicationdatastructure.MediaItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/14/14
 * Time: 11:59 AM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawMediaResponse extends RawApiResponse{
    public MediaItem[] results;
}
