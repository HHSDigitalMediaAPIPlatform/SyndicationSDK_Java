package com.ctacorp.syndication.sdk;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 12/19/13
 * Time: 1:03 PM
 */
public class SyndicationResponse {
    int status                      = 200;
    ArrayList<Message> messages;
    String results;
    boolean success;

    public SyndicationResponse(){}
}
