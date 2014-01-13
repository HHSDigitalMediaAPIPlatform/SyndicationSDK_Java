package com.ctacorp.syndication.sdk.jsonparsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 1:13 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawErrorResponse extends RawApiResponse {
    public RawErrorResponse(int statusCode, Message message){
        this.meta.messages = new Message[1];
        this.meta.messages[0] = message;
        this.meta.status = statusCode;
    }
}
