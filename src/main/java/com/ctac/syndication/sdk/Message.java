package com.ctac.syndication.sdk;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/9/14
 * Time: 12:34 PM
 */
public class Message {
    public String errorMessage;
    public String errorDetail;
    public int errorCode;

    public Message(String errorMessage, String errorDetail, int errorCode){
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
        this.errorCode = errorCode;
    }
}
