package com.ctacorp.syndication.sdk.jsonparsing;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/13/14
 * Time: 1:38 PM
 */
public class RestErrorHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        //400s and 500s are handled by the server with custom error response payloads
        //We want to pass those through and not re-handle them
        switch(response.getStatusCode().value()){
            case 400: return false;
            case 500: return false;
            default: return true;
        }
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        //do nothing
    }
}
