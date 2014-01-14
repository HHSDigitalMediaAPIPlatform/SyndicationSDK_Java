package com.ctacorp.syndication.sdk;

import com.ctacorp.syndication.sdk.exception.InvalidRequestException;
import com.ctacorp.syndication.sdk.jsonparsing.*;
import com.ctacorp.syndication.sdk.syndicationdatastructure.*;
import org.apache.http.NameValuePair;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import org.apache.http.client.utils.URIBuilder;

import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.List;

/**
 * Primary class for interacting with the Syndication APIs.
 * This class is used to communicated with the Syndication API services with convenient helper
 * methods and POJO data holders.
 *
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 12/19/13
 * Time: 12:54 PM
 *
 */
public class SyndicationClient {
    static private final String apiVersion = "1.0";
    private String syndicationApiUrl = "";

    public SyndicationClient(String syndicationApiUrl){
        this.syndicationApiUrl = syndicationApiUrl;
    }

    public MediaType[] getAllMediaTypes(){
        URI uri = buildURI(syndicationApiUrl + "/resources/mediaTypes.json");
        RawMediaTypeResponse raw = (RawMediaTypeResponse) api(uri, RawMediaTypeResponse.class);

        return raw.results;
    }

    public Organization[] getAllOrganizations(){
        URI uri = buildURI(syndicationApiUrl + "/resources/organizations.json");
        RawOrganizationResponse raw = (RawOrganizationResponse) api(uri, RawOrganizationResponse.class);
        return raw.results;
    }

    public Organization getOrganizationById(long id) throws InvalidRequestException {
        URI uri = buildURI(syndicationApiUrl + "/resources/organizations/"+id+".json");
        RawApiResponse rawResp = api(uri, RawOrganizationResponse.class);
        if(rawResp.meta.status == 400){
            throw new InvalidRequestException("The server responded with a 400 error, details: "+rawResp);
        }
        RawOrganizationResponse raw = (RawOrganizationResponse) rawResp;
        return raw.results[0];
    }

    public Campaign[] getAllCampaigns(){
        URI uri = buildURI(syndicationApiUrl + "/resources/campaigns.json");
        RawCampaignResponse raw = (RawCampaignResponse) api(uri, RawCampaignResponse.class);
        return raw.results;
    }

    public Campaign getCampaignById(long id) throws InvalidRequestException {
        URI uri = buildURI(syndicationApiUrl + "/resources/campaigns/"+id+".json");
        RawApiResponse rawResp = api(uri, RawCampaignResponse.class);
        if(rawResp.meta.status == 400){
            throw new InvalidRequestException("The server responded with a 400 error, details: "+rawResp);
        }
        RawCampaignResponse raw = (RawCampaignResponse) rawResp;
        return raw.results[0];
    }

    public Language[] getAllLanguages(){
        URI uri = buildURI(syndicationApiUrl + "/resources/languages.json");
        RawLanguageResponse raw = (RawLanguageResponse) api(uri, RawLanguageResponse.class);
        return raw.results;
    }

    public Language getLanguageById(long id) throws InvalidRequestException {
        URI uri = buildURI(syndicationApiUrl + "/resources/languages/"+id+".json");
        RawApiResponse rawResp = api(uri, RawLanguageResponse.class);
        if(rawResp.meta.status == 400){
            throw new InvalidRequestException("The server responded with a 400 error, details: "+rawResp);
        }
        RawLanguageResponse raw = (RawLanguageResponse) rawResp;
        return raw.results[0];
    }

    public Tag getTagById(long id){
        return null;
    }

    public Tag[] getRelatedTagsById(long id){
        return null;
    }

    //java
    public Tag[] getRelatedTagsByTag(Tag tag){
        return null;
    }

    public Tag[] getTagsForMediaId(long id){
        return null;
    }

    //java
    public Tag[] getTagsForMedia(MediaItem media){
        return null;
    }

    public MediaItem[] searchMediaMetadata(String query){
        return null;
    }

    public MediaItem getMediaById(long id){
        return null;
    }

    public MediaItem getMediaByUrl(String url){
        return null;
    }

    public MediaItem[] getMediaByTagId(long id){
        return null;
    }

    //java
    public MediaItem[] getMediaByTag(Tag tag){
        return null;
    }

    public long publish(MediaItem item){
        return -1;
    }

    public void unpublish(long id){

    }

    public void subscribeByMediaId(long id){

    }

    public void unSubscribeByMediaId(long id){

    }

    //java
    public void unSubscribeByMedia(MediaItem media){

    }

    public Cms getCmsMetaData(){
        return null;
    }

    public MediaItem[] getSubscriptions(){
        return null;
    }

    public byte[] getMediaDataByMediaId(long id){
        return null;
    }

    //java
    public BufferedImage getImageForMediaId(long id){
        return null;
    }

    //java
    public BufferedImage getImageForMedia(MediaItem media){
        return null;
    }

    public byte[] getMediaPreviewByMediaId(long id){
        return null;
    }

    //java
    public byte[] getMediaPreviewByMedia(MediaItem media){
        return null;
    }

    //java
    public BufferedImage getPreviewByMediaId(long id){
        return null;
    }

    //java
    public BufferedImage getPreviewByMedia(MediaItem media){
        return null;
    }

    public byte[] getMediaThumbnailByMediaId(long id){
        return null;
    }

    //java
    public byte[] getMediaThumbnailByMedia(MediaItem mi){
        return null;
    }

    public String getMediaEmbeddedHtmlByMediaId(long id){
        return null;
    }

    //java
    public String getMediaEmbeddedHtmlByMediaId(MediaItem media){
        return null;
    }

    public String getMediaJavascriptEmbedTagByMediaId(long id){
        return null;
    }

    //java
    public String getMediaJavascriptEmbedTagByMedia(MediaItem media){
        return null;
    }

    public YoutubeMetaData getMediaYoutubeMetadataByMediaId(long id){
        return null;
    }

    //java
    public YoutubeMetaData getMediaYoutubeMetadataByMedia(MediaItem media){
        return null;
    }

    public String getMediaIframeEmbeddedTagByMediaId(long id){
        return null;
    }

    //java
    public String getMediaIframeEmbeddedTagByMediaId(MediaItem media){
        return null;
    }

    //Getters and Setters ----------------------------------------------------
    public String getClientVersion(){
        return apiVersion;
    }

    //Helper Methods ---------------------------------------------------------

    public boolean ping(String url){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity resp = restTemplate.getForEntity(url, null);
        if(resp.getStatusCode().value() == 200){
            return true;
        } else{
            System.out.println("Tried to get to "+url+" but couldn't find it.");
            System.out.println(resp);
        }
        return false;
    }

    private RawApiResponse api(URI uri, Class theClass){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new RestErrorHandler());
        RawApiResponse raw = null;

        try{
            raw = (RawApiResponse)restTemplate.getForObject(uri, theClass);
        } catch(HttpClientErrorException e){
            switch(e.getStatusCode().value()){
                case 404:
                    Message message = new Message();
                    message.errorCode = 404;
                    message.errorMessage = "Server Resource not found!";
                    message.errorDetail = "404 occurred on: "+new Date()+" on resource: "+uri;
                    message.userMessage = "The api attempted to call a server resource that was not found. " +
                        "This may indicate that the server URL is incorrect, that this is the wrong version client for the specified server, " +
                        "or that something on the server has changed unexpectedly.";
                    raw = new RawErrorResponse(404, message);
                    break;
            }
        }

        return raw;
    }

    private URI buildURI(String url){
        try {
            return new URI(url);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    private URI buildURI(String url, List<NameValuePair> params){
        try {
            URIBuilder urib = new URIBuilder(url);
            urib.addParameters(params);
            return urib.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}