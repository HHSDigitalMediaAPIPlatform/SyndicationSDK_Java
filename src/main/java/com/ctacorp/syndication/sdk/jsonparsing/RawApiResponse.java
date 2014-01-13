package com.ctacorp.syndication.sdk.jsonparsing;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 11:15 AM
 */

public abstract class RawApiResponse {
    public Meta meta;
    public Object[] results;

    public String toString(){
        String str = "";
        str += "RawApiResponse\n";
        str += "  meta\n";
        str += "    status: "+meta.status + "\n";
        str += "    messages\n";

        for(Message m : meta.messages){
            str += "      Message\n";
            str += "        errorCode:"+m.errorCode + "\n";
            str += "        errorDetail:"+m.errorDetail + "\n";
            str += "        errorMessage:"+m.errorMessage + "\n";
            str += "        userMessage:"+m.userMessage + "\n";
        }

        return str;
    }
}
