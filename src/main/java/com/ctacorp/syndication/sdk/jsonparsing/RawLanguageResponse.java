package com.ctacorp.syndication.sdk.jsonparsing;

import com.ctacorp.syndication.sdk.syndicationdatastructure.Language;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 2:25 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawLanguageResponse extends RawApiResponse{
    public Language[] results;

    public String toString(){
        String str = super.toString();
        str += "  results\n";
        for(Language l : results){
            str += "    Language\n";
            str += "      name:"+l.name +"\n";
            str += "      id:"+l.id+"\n";
            str += "      value:"+l.value+"\n";
        }
        return str;
    }
}