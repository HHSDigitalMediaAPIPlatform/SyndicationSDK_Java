package com.ctacorp.syndication.sdk.jsonparsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 1:15 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
    public int      errorCode;
    public String   errorDetail;
    public String   errorMessage;
    public String   userMessage;
}
