# HHS Media Services API - JAVA SDK

---
####Version Information####

```
SDK Distribution: v2-beta
HHS Media Services API: v2
Java: 1.7.0_55
Gradle: 1.12
```
---

[TOC]

---
## About

This SDK provides the utility classes, example code, and documentation tools to build a Java REST client for the HHS Media Services API.

---
## Prerequisites

You must have Java 1.6 or higher installed to build the SDK.

The SDK uses [Gradle](http://www.gradle.org) as its build tool, but you do not need to have Gradle installed. The SDK includes the Gradle wrapper, which contains all the needed dependencies.

---
## Installation

```sh
unzip syndication-java-sdk-v2-beta.zip
cd syndication-java-sdk-v2-beta
./gradlew build
```

The last command compiles the source, executes the example Junit tests and builds a JAR file that you use in your own application. See the next section for further information.

---
## Using the SDK

### Documentation

You are encouraged to use the live interactive [Swagger](https://helloreverb.com/developers/swagger) documentation available on the [HHS Media Services API](http://ctacdev.com:8090/Syndication). It provides a convenient UI for testing the REST operations as well as the documentation for the production version of the HHS Media Services API.

Offline Javadocs can be found at [generated/syndication-java-sdk-v2-beta-javadoc/index.html](generated/syndication-java-sdk-v2-beta-javadoc/index.html). To regenerate the Javadocs, just run the following gradle tasks:

```sh
./gradlew clean build -x test javadocs
```

The last command rebuilds the project and the Javadocs while skipping the tests.

### Included libraries

The Gradle build tool will automatically download the dependencies needed by the SDK, with the exception of the auto-generated REST client library (*com.ctacorp.syndication:syndication-java-client:v2*) that is included in [libs](libs) folder.

*syndication-java-client* is the REST client library that is auto-generated using the [swagger-codegen](https://github.com/wordnik/swagger-codegen) project, and is based on the the HHS Media Services API's Swagger [specification](http://ctacdev.com:8090/Syndication/swagger/api). *syndication-java-client* can be used independently of the SDK to create a REST client, however the auto-generated code is sometimes not always developer friendly. The SDK wraps the *syndication-java-client* client API to make it easier to use.

### Test Cases and Examples

Included in the SDK are several Junit tests that are intended to serve as code examples. They can be found in [src/test/java](src/test/java). The tests are grouped by API resource, and each REST service method has at least one corresponding test case. There are also tests that demonstrate pagination.

### Configuration

By default, the HHS Media Services API's base URL is set to [http://ctacdev.com:8090/Syndication/api/v2](http://ctacdev.com:8090/Syndication/api/v2). To change it, open [src/main/resources/sdk.properties](src/main/resources/sdk.properties), and set the `api.base.url` property to the correct value.

### Simple Example

```java
package com.ctacorp.syndication.client.sdk.examples;

import com.ctacorp.syndication.client.common.ApiException;
import com.ctacorp.syndication.client.model.Campaign;
import com.ctacorp.syndication.client.model.Campaigns;
import com.ctacorp.syndication.client.sdk.ResourcesApi;
import com.ctacorp.syndication.client.sdk.Pagination;

import java.util.List;
import org.junit.Test;

public class ReadmeExample {

    @Test
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
```

### Pagination

Many of the HHS Media Services API's resources can be retrieved using pagination. See [PaginationTest.java](src/test/java/com/ctacorp/syndication/client/sdk/examples/PaginationTest.java) for a more detailed example of how to use pagination.

### API Calls by Resource Type

#### Resources

```
Resources	getResources(java.lang.String query)
```

#### Languages

```
Languages	getLanguages()
Languages	getLanguages(Pagination pagination)
```

#### Campaigns

```
Campaigns	getCampaignById(java.lang.Long id)
Campaigns	getCampaigns()
Campaigns	getCampaigns(Pagination pagination)
```

#### Media

```
MediaItems	searchMedia(java.lang.String query)
MediaItems	searchMedia(java.lang.String query, Pagination pagination)
```

```
MediaItems	getMedia(GetMediaRequest request)
MediaItems	getMedia(GetMediaRequest request, Pagination pagination)
MediaItems	getMediaByCampaignId(java.lang.Long id)
MediaItems	getMediaByCampaignId(java.lang.Long id, Pagination pagination)
MediaItems	getMediaById(java.lang.Long id)
MediaItems	getMediaByTagId(java.lang.Long id)
MediaItems	getMediaByTagId(java.lang.Long id, Pagination pagination)
MediaItems	getMostPopularMediaItems()
MediaItems	getMostPopularMediaItems(Pagination pagination)
MediaItems	getRelatedMediaById(java.lang.Long id)
MediaItems	getRelatedMediaById(java.lang.Long id, Pagination pagination)
```

```
java.lang.String	getMediaContentById(java.lang.Long id)
```

```
EmbedCode	getMediaEmbedById(java.lang.Long id)
EmbedCode	getMediaEmbedById(java.lang.Long id, EmbedProperties embedProperties)
```

```
java.lang.String	getMediaPreviewById(java.lang.Long id)
java.lang.String	getMediaPreviewById(java.lang.Long id, ImageProperties imageProperties)
```

```
Ratings	getMediaRatingsById(java.lang.Long id)
```

```
SyndicatedMediaItems	getMediaSyndicateById(java.lang.Long id)
SyndicatedMediaItems	getMediaSyndicateById(java.lang.Long id, SyndicateProperties syndicateProperties)
```

```
YoutubeMetadata		getMediaYoutubeMetaDataById(java.lang.Long id)
```

#### Sources

```
Sources	getSourceById(java.lang.Long id)
Sources	getSources()
Sources	getSources(Pagination pagination)
```

#### Tags

```
Tags getTagById(java.lang.Long id)
```

```
TagLists	getTags(GetTagsRequest request)
TagLists	getTags(GetTagsRequest request, Pagination pagination)
TagTypes getTagTypes()
```

---
## Other Resources

Other SDKs are available for the HHS Media Services API. They can be found at the links below:

* [Javascript](https://bitbucket.org/ctacdevteam/syndicationsdk_js)
* [PHP](https://bitbucket.org/ctacdevteam/syndicationsdk_php)
* [Objective C](https://bitbucket.org/ctacdevteam/syndicationsdk_objectivec)

https://bitbucket.org/ctacdevteam/syndicationsdk_php

---
## Getting Help

For any API or SDK questions or to leave feedback, please contact [syndication@ctacorp.com](mailto:syndication@ctacorp.com)
