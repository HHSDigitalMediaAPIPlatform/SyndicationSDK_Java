package com.ctacorp.syndication.sdk.syndicationdatastructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/9/14
 * Time: 2:04 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {
    public String name;
    public String abv;
    public String url;
    public long id;
}
