package com.ctacorp.syndication.sdk.jsonparsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 11:14 AM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta{
    public int status;
    public Pagination pagination;
    public Message[] messages;
}
