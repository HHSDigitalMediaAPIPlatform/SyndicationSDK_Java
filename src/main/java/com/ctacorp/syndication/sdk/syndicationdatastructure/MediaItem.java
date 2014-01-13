package com.ctacorp.syndication.sdk.syndicationdatastructure;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Steffen Gates
 * Date: 1/9/14
 * Time: 12:37 PM
 */
public class MediaItem {
    public String   mediaType;
    public long     id;
    public String   name;
    public String   sourceUrl;
    public String   targetUrl;
    public Date     dateAuthored;
    public Date     dateUpdated;
    public Date     datePublished;
    public String   language;
    public long     organizationId;
    public String   description;
    public String   licenseInfo;
    public String   externalGuid;
    public String   hash;
    public URL      tinyUrl;
    public String   tinyUrlToken;
    public int      duration; //In seconds
    public long[]   mediaItemIds;
    public long[]   campaignIds;
    public String   seoText;
    public int      width;
    public int      height;
    public String   imageFormat;
    public String   altText;
    public String   socialMediaType;
    public String   code;
}
