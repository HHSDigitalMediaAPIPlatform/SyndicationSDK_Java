package com.ctacorp.syndication.sdk.syndicationdatastructure;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/9/14
 * Time: 2:49 PM
 */
public class MediaType {
    public String name;

    public MediaType(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
