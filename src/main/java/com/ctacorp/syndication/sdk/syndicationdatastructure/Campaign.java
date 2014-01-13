package com.ctacorp.syndication.sdk.syndicationdatastructure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/9/14
 * Time: 2:01 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {
    public long id;
    public String name;
    public String description;
    public Date startDate;
    public Date endDate;
}
