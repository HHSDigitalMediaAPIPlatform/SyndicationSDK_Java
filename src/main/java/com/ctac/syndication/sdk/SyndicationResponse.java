package com.ctac.syndication.sdk;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 12/19/13
 * Time: 1:03 PM
 */
public class SyndicationResponse {
    String format; //what is this?
    int status                      = 200;
    ArrayList<Message> messages;
    String results;
    boolean success;

    public SyndicationResponse(){}
}
