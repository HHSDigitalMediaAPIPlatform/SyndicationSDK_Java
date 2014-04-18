# HHS Media Services API - JAVA SDK

**Build Information**

```
SDK Distribution: syndication-java-sdk-v2-alpha
API Version: v2
Gradle: 1.11
Java: 1.7.0_51
```
---

[TOC]

## About

This SDK provides the utility classes, example code, and documentation tools to build a Java REST client for the HHS Media Services API.

---
## Prerequisites

You must have Java 1.6 or higher installed to build the SDK.

The SDK uses [Gradle](http://www.gradle.org) as its build tool, but you do not need to have Gradle installed. The SDK includes the Gradle wrapper, which contains all the needed dependencies.

---
## Installation

```sh
unzip syndication-java-sdk-v2-alpha.zip
cd syndication-java-sdk-v2-alpha
./gradlew build
```

The last command compiles the source, executes the example Junit tests and builds a JAR file that you use in your own application. See the next section for further information.

---
## Using the SDK

### API Documentation

The SDK includes offline API documentation for convenience, but you are encouraged to use the live interactive [Swagger](https://helloreverb.com/developers/swagger) documentation available on the [HHS Media Services API](http://ctacdev.com:8090/Syndication). The offline [documentation](API_DOCS.md) is included in the root of the SDK distribution.

### Included libraries

The Gradle build tool will automatically download the dependencies needed by the SDK, with the exception of the *com.ctacorp.syndication:syndication-java-client:v2*. This library is included in [libs](libs) folder.

*syndication-java-client* is the REST client library that is auto-generated using the [swagger-codegen](https://github.com/wordnik/swagger-codegen) project, and is based on the the HHS Media Services API's Swagger [specification](http://ctacdev.com:8090/Syndication/swagger/api). *syndication-java-client* can be used independently of the SDK to create a REST client, however the auto-generated code is not always developer friendly. The SDK wraps the *syndication-java-client* client API to make it easier to use.

### Test Cases and Examples

Included in the SDK are several Junit tests that are intended to serve as code examples. They can be found in [src/test/java](src/test/java). The tests are grouped by API resource, and each REST service method has at least one corresponding test case. There are also tests that demonstrate pagination.

### Configuration

By default, the HHS Media Services API's base URL is set to [http://ctacdev.com:8090/Syndication/api/v2](http://ctacdev.com:8090/Syndication/api/v2). To change it, open [src/main/resources/sdk.properties](src/main/resources/sdk.properties), and set the `api.base.url` property to the correct value.

### Client API

The following example illustrates how to use the SDK's REST client interface:

	
	import com.ctacorp.syndication.client.common.ApiException;
	import com.ctacorp.syndication.client.model.Campaign;
	import com.ctacorp.syndication.client.model.Campaigns;
	import com.ctacorp.syndication.client.sdk.ResourcesApi;
	import com.ctacorp.syndication.client.sdk.Pagination;
	
	import java.util.List;
	
	public class Test {
	
	    public void testIt() {
	
	        ResourcesApi resourcesApi = new ResourcesApi();
	
	        resourcesApi.setBasePath("http://ctacdev.com:8090/Syndication/api/v2");
	
	        Pagination pagination = new Pagination();
	        pagination.setMax(10);
	        pagination.setSort("ASC");
	        pagination.setOffset(0);
	        resourcesApi.setPagination(pagination);
	
	        try {
	
	            Campaigns campaigns = resourcesApi.getCampaigns();
	            List<Campaign> results = campaigns.getResults();
	
	            for (Campaign campaign : results) {
	                System.out.println(campaign);
	            }
	
	        } catch (ApiException e) {
	            e.printStackTrace();
	        }
	    }
	}
 
##### Available Client API Methods
 
 
*** com.ctacorp.syndication.client.sdk.ResourcesApi ***

	Campaigns getCampaignById(Long id)
	 
	Campaigns getCampaigns()
	 
	Campaigns getCampaigns(Pagination pagination)
	
	 
	Languages getLanguageById(Long id)
	 
	Languages getLanguages()
	 
	Languages getLanguages(Pagination pagination)
	
	 
	MediaItems getMediaById(Long id)
	
	MediaItems getMedia(GetMediaRequest request)
	 
	MediaItems getMedia(GetMediaRequest request, Pagination pagination)
	 
	MediaItems getMediaByCampaignId(Long id)
	 
	MediaItems getMediaByCampaignId(Long id, Pagination pagination)
	 
	MediaItems getMediaByTagId(Long id)
	 
	MediaItems getMediaByTagId(Long id, Pagination pagination)
	
	
	String getMediaContentById(Long id)
	
	String getMediaPreviewById(Long id)
	 
	String getMediaPreviewById(Long id, ImageProperties imageProperties)
	
	 
	EmbedCode getMediaEmbedById(Long id)
	 
	EmbedCode getMediaEmbedById(Long id, EmbedProperties embedProperties)
	
	 
	Ratings getMediaRatingsById(Long id)
	
	 
	SyndicatedMediaItems getMediaSyndicateById(Long id)
	 
	SyndicatedMediaItems getMediaSyndicateById(Long id, SyndicateProperties syndicateProperties)
	 
	
	MediaTypes getMediaTypes()
	
	
	YoutubeMetadata getMediaYoutubeMetaDataById(Long id)
	
	 
	MediaItems getMostPopularMediaItems()
	 
	MediaItems getMostPopularMediaItems(Pagination pagination)
	 
	MediaItems getRelatedMediaById(Long id)
	 
	MediaItems getRelatedMediaById(Long id, Pagination pagination)
	
	 
	TagLists getRelatedTagsById(Long id)
	 
	TagLists getRelatedTagsById(Long id, Pagination pagination)
	
	 
	Resources getResources(String query)
	
	 
	Sources getSourceById(Long id)
	 
	Sources getSources()
	 
	Sources getSources(Pagination pagination)
	
	 
	Tags getTagById(Long id)
	
	 
	TagLists getTags(GetTagsRequest request)
	 
	TagLists getTags(GetTagsRequest request, Pagination pagination)
	
	 
	TagTypes getTagTypes()
	
	 
	MediaItems searchMedia(String query)
	 
	MediaItems searchMedia(String query, Pagination pagination)
	
	 
	void setBasePath(String basePath)
	 
	void setPagination(Pagination pagination)
	

## Other Resources

## Getting Help