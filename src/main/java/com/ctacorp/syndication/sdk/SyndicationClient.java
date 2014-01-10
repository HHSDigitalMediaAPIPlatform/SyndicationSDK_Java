package com.ctacorp.syndication.sdk;

import com.ctacorp.syndication.sdk.syndicationdatastructure.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.awt.image.BufferedImage;
import java.util.LinkedHashMap;

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


        return null;
    }

    public Organization[] getAllOrganizations(){
        return null;
    }

    public Organization getOrganizationById(long id){
        return null;
    }

    public Campaign[] getAllCampaigns(){
        return null;
    }

    public Campaign getCampaignById(long id){
        return null;
    }

    public Language[] getAllLanguages(){
        return null;
    }

    public Language getLanguageById(long id){
        return null;
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

    public boolean testConnectionTo(String url){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url).path("");
        Response response = target.request().get();
        if(response.getStatus() != 200){
            return false;
        }
        return true;
    }

    private SyndicationResponse api(String path, LinkedHashMap<String, String> params){
        String url = syndicationApiUrl + path;

        return null;
    }
}