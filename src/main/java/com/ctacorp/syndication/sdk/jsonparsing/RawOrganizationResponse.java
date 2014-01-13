package com.ctacorp.syndication.sdk.jsonparsing;

import com.ctacorp.syndication.sdk.syndicationdatastructure.Organization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 11:07 AM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawOrganizationResponse extends RawApiResponse{
    public Organization[] results;
}
