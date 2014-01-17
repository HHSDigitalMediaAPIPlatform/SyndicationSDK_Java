package com.ctacorp.syndication.sdk.syndicationdatastructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/9/14
 * Time: 2:27 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Language {
    public long id;
    public String name;
    public String value;
}
