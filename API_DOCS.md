#HHS Media Services API
###API Details
**API Version** v2
**Swagger Version** 1.2
**Contact** syndication@hhs.gov
**License** GNU GENERAL PUBLIC LICENSE
**License Url** [http://www.gnu.org/licenses/gpl.html](http://www.gnu.org/licenses/gpl.html)
**License Url** [http://www.hhs.gov/web/socialmedia/policies/tos.html#ready](http://www.hhs.gov/web/socialmedia/policies/tos.html#ready)

<div class="swagger-ui-wrap extraFooter"><h3>Common Features / Behaviors</h3>
    <div class="features">
        <ul>
            <li><strong>* "sort" param:</strong> supports multi column sorting through the use of commas as delimiters, and a hyphen to denote descending order.
                <br/>
                <strong><span>Examples:</span></strong>
                <ul>
                    <li><span class="example">name</span><span class="description">sort results by name ascending</span></li>
                    <li><span class="example">-name</span><span class="description">sort results by name descending</span></li>
                    <li><span class="example">-name,id</span><span class="description">sort results by name descending and then by id ascending</span></li>
                    <li><span class="example">id,-dateContentAuthored</span><span class="description">sort results by id ascending and then date descending</span></li>
                </ul>
            </li>
            <li><strong>Date formats:</strong> Date input format is expected to be based on <a href="http://www.ietf.org/rfc/rfc3339.txt">RFC 3339</a>. <br/>
                <span><strong>Example:</strong></span>
                <ul><li>2013-11-18T18:43:01Z</li></ul>
            </li>
        </ul>
    </div>
</div>


###API Listing
####Resource: /campaigns
**Description** Information about campaigns
**Base Path** http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources/campaigns.json
**Description** Media Listings for a specif campaign
**Operations**
**Method** GET
**Nickname** getCampaigns
**Notes** Returns the list of Campaigns.
######Parameters
* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: * Set of fields to sort the records by.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/campaigns/{id}.json
**Description** Information about a specific campaign
**Operations**
**Method** GET
**Nickname** getCampaignById
**Notes** Returns the Campaign identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the record to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/campaigns/{id}/media.json
**Description** Campaign Listings
**Operations**
**Method** GET
**Nickname** getMediaByCampaignId
**Notes** Returns the list of MediaItems for the Campaign identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the campaign to find media items for  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: The name of the property to which sorting will be applied  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  


---
####Resource: /languages
**Description** Information about languages
**Base Path**: http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources/languages.json
**Description** Language Listings
**Operations**
**Method** GET
**Nickname** getLanguages
**Notes** Returns the list Languages.
######Parameters
* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: * Set of fields to sort the records by.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/languages/{id}.json
**Description** Information about a specific language
**Operations**
**Method** GET
**Nickname** getLanguageById
**Notes** Returns the Language identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the language to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  


---
####Resource: /media
**Description** Information about media
**Base Path** http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources/media.json
**Description** Media Items Listings
**Operations**
**Method** GET
**Nickname** getMedia
**Notes** Returns the list of MediaItems matching the specified query parameters.
######Parameters
* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: * Set of fields to sort the records by.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: mediaTypes  
**required**: false  
**description**: Find all media items belonging to the specified media type[s].  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: name  
**required**: false  
**description**: Find all media items containing the provided name, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: nameContains  
**required**: false  
**description**: Find all media items containing the partial name, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: descriptionContains  
**required**: false  
**description**: Find all media items containing the provided partial description, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceUrl  
**required**: false  
**description**: Find all media items which have the provided sourceUrl, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceUrlContains  
**required**: false  
**description**: Find all media items which contain the provided partial sourceUrl, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: dateContentAuthored  
**required**: false  
**description**: Find all media items authored on the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: dateContentUpdated  
**required**: false  
**description**: Find all media items updated on the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: dateContentPublished  
**required**: false  
**description**: Find all media items published on the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: dateContentReviewed  
**required**: false  
**description**: Find all media items reviewed on the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: dateSyndicationCaptured  
**required**: false  
**description**: Find all media items authored on the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: dateSyndicationUpdated  
**required**: false  
**description**: Find all media items updated on the provided day, (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentAuthoredSinceDate  
**required**: false  
**description**: Find all media items authored since the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentAuthoredBeforeDate  
**required**: false  
**description**: Find all media items authored before the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentAuthoredInRange  
**required**: false  
**description**: Find all media items authored between the provided start and end days (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentUpdatedSinceDate  
**required**: false  
**description**: Find all media items updated since the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentUpdatedBeforeDate  
**required**: false  
**description**: Find all media items updated before the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentUpdatedInRange  
**required**: false  
**description**: Find all media items updated between the provided start and end days (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentPublishedSinceDate  
**required**: false  
**description**: Find all media items published since the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentPublishedBeforeDate  
**required**: false  
**description**: Find all media items published before the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentPublishedInRange  
**required**: false  
**description**: Find all media items published between the provided start and end days (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentReviewedSinceDate  
**required**: false  
**description**: Find all media items reviewed since the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentReviewedBeforeDate  
**required**: false  
**description**: Find all media items reviewed before the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: contentReviewedInRange  
**required**: false  
**description**: Find all media items reviewed between the provided start and end days (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationCapturedSinceDate  
**required**: false  
**description**: Find all media items authored since the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationCapturedBeforeDate  
**required**: false  
**description**: Find all media items authored before the provided day (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationCapturedInRange  
**required**: false  
**description**: Find all media items authored between the provided start and end days (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationUpdatedSinceDate  
**required**: false  
**description**: Find all media items updated since the provided day, (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationUpdatedBeforeDate  
**required**: false  
**description**: Find all media items updated before the provided day, (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationUpdatedInRange  
**required**: false  
**description**: Find all media items updated between the provided start and end days, (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationVisibleSinceDate  
**required**: false  
**description**: Find all media items visible since the provided day, (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationVisibleBeforeDate  
**required**: false  
**description**: Find all media items visible before the provided day, (RFC 3339, time ignored).  
**paramType**: query  
**type**: string  
**format**: date  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationVisibleInRange  
**required**: false  
**description**: Find all media items visible between the provided start and end days, (RFC 3339, comma separated, time ignored).  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: languageId  
**required**: false  
**description**: Find all media items written in the language specified by Id.  
**paramType**: query  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: languageName  
**required**: false  
**description**: Find all media items written in the language specified by name, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: languageIsoCode  
**required**: false  
**description**: Find all media items written in the language specified by 639-2 isoCode , case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: hash  
**required**: false  
**description**: Find all media items which match the provided hash, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: hashContains  
**required**: false  
**description**: Find all media items which match the provided partial hash, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceId  
**required**: false  
**description**: Find all media items that belong to the source specified by Id.  
**paramType**: query  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceName  
**required**: false  
**description**: Find all media items that belong to the source specified by name, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceNameContains  
**required**: false  
**description**: Find all media items that belong to the source specified by partial name, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceAcronym  
**required**: false  
**description**: Find all media items that belong to the source specified by acronym, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sourceAcronymContains  
**required**: false  
**description**: Find all media items that belong to the source specified by partial acronym, case insensitive.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: tagIds  
**required**: false  
**description**: Find only media items tagged with the specified tag Ids.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: restrictToSet  
**required**: false  
**description**: Find only media from within the supplied list of Ids.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/mostPopularMedia.{format}
**Description** Get the media with the highest ratings.
**Operations**
**Method** GET
**Nickname** getMostPopularMedia
**Notes** Returns the list of MediaItems with the highest ratings.
######Parameters
* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/searchResults.json
**Description** Full search
**Operations**
**Method** GET
**Nickname** searchMedia
**Notes** Returns the list of MediaItems matching the search query 'q'.<p>The search query 'q' is a Lucene query.<br>The syntax for a Lucene query can be found <a href="http://lucene.apache.org/core/2_9_4/queryparsersyntax.html">here</a>
######Parameters
* **name**: q  
**required**: true  
**description**: The search query supplied by the user  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: * Set of fields to sort the records by.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}.json
**Description** Information about a specific media item
**Operations**
**Method** GET
**Nickname** getMediaById
**Notes** Returns the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the record to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/content
**Description** The actual media content (html, image, etc...)
**Operations**
**Method** GET
**Nickname** getMediaContentById
**Notes** Returns the raw content (html, image, etc...) for the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the media to show content for.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/embed.json
**Description** Get the javascript or iframe embed code for this item (to embed it on a web page).
**Operations**
**Method** GET
**Nickname** getMediaEmbedById
**Notes** Returns the javascript or iframe embed code for the MediaItem identified by 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the media to get embed code for.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: flavor  
**required**: false  
**description**: Currently supports 'iframe', defaults to 'javascript'.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: width  
**required**: false  
**description**: The width of the generated iframe.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: height  
**required**: false  
**description**: The height of the generated iframe.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: iframeName  
**required**: false  
**description**: The name of the iframe element  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: excludeJquery  
**required**: false  
**description**: Should a reference to the JQuery Library be omitted?  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: excludeDiv  
**required**: false  
**description**: Should the div to insert content into be omitted?  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: divId  
**required**: false  
**description**: Should the div to insert content into have a specific name?  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/preview.jpg
**Description** Get the jpg preview of the content item where applicable.
**Operations**
**Method** GET
**Nickname** getMediaPreviewById
**Notes** Returns the JPG preview, where applicable, for the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the media to get a preview for.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: imageFloat  
**required**: false  
**description**: Accepts valid CSS float options, such as 'left' or 'right'. Will inject a style into the content before rendering.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: imageMargin  
**required**: false  
**description**: Accepts 4 CSV values representing pixel sizes of margin similar to CSS. Default format is 'north,east,sout,west' - for example '0,10,10,0' would put a 10 pixel margin on the right and bottom sides of an image. Will inject a style into the content before rendering.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: previewSize  
**required**: false  
**description**: Accepts several preset sizes: thumbnail, small, medium, large, custom. The use of custom requires that height and width be provided as well.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: width  
**required**: false  
**description**: (Requires previewSize=custom) Supply the width of the custom preview.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: height  
**required**: false  
**description**: (Requires previewSize=custom) Supply the height of the custom preview.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: crop  
**required**: false  
**description**: Turn automatic image cropping on/off (off by default when using preset sizes).  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/ratings.json
**Description** Get the 'like' count for the specified media item.
**Operations**
**Method** GET
**Nickname** getMediaRatingsById
**Notes** Get the Ratings (number of 'likes') for the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The ID of the media item to 'like'.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/relatedMedia.{format}
**Description** Get the media related to the current media item.
**Operations**
**Method** GET
**Nickname** getRelatedMediaById
**Notes** Returns the list of MediaItems related to the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the media item to get related media for  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: Which field to sort the records by.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/syndicate.{format}
**Description** Get syndicated content.
**Operations**
**Method** GET
**Nickname** getMediaSyndicateById
**Notes** Returns the syndicated content for a given MediaItem in the specified 'format' (HTML or JSON).
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the media to show embed code for.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: cssClass  
**required**: false  
**description**: The css class to target for extraction.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**: syndicate  
**allowMultiple**: false  

* **name**: stripStyles  
**required**: false  
**description**: Remove in-line styles from content.  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: stripScripts  
**required**: false  
**description**: Remove script tags from content.  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: stripImages  
**required**: false  
**description**: Remove image tags from content.  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: stripBreaks  
**required**: false  
**description**: Remove break tags from content.  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: stripClasses  
**required**: false  
**description**: Remove class attributes from content (except 'syndicate').  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

* **name**: font-size  
**required**: false  
**description**: Set font size (in points) of p, div, and span tags.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: imageFloat  
**required**: false  
**description**: Accepts valid CSS float options, such as 'left' or 'right'. Will inject a style into the content before rendering.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: imageMargin  
**required**: false  
**description**: Accepts 4 CSV values representing pixel sizes of margin similar to CSS. Default format is 'north,east,south,west' - for example '0,10,10,0' would put a 10 pixel margin on the right and bottom sides of an image. Will inject a style into the content before rendering.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: autoplay  
**required**: false  
**description**: If content is a video, the embeded video will auto play when loaded.  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: true  
**allowMultiple**: false  

* **name**: rel  
**required**: false  
**description**: If content is a video, related items will be shown at the end of playback.  
**paramType**: query  
**type**: boolean  
**format**: null  
**defaultValue**: false  
**allowMultiple**: false  

**Path** /resources/media/{id}/thumbnail.jpg
**Description** Get the jpg thumbnail of the content item where applicable.
**Operations**
**Method** GET
**Nickname** getMediaThumbnailById
**Notes** Returns the JPG thumbnail, where applicable, for the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the media to get a thumbnail for.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/media/{id}/youtubeMetaData.json
**Description** Youtube meta-data for a video item.
**Operations**
**Method** GET
**Nickname** getMediaYoutubeMetaDataById
**Notes** Returns the Youtube metadata, where applicable, for the MediaItem identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the video to show meta data for.  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  


---
####Resource: /mediaTypes
**Description** Information about media types
**Base Path** http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources/mediaTypes.{format}
**Description** Information about media types
**Operations**
**Method** GET
**Nickname** getMediaTypes
**Notes** Returns the list of available MediaTypes.
######Parameters

---
####Resource: /resources
**Description** Global Search
**Base Path** http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources.json
**Description** Global search
**Operations**
**Method** GET
**Nickname** getResources
**Notes** Returns the list of Resources matching the search query 'q'.<p>The search query 'q' is a Lucene query.<br>The syntax for a Lucene query can be found <a href="http://lucene.apache.org/core/2_9_4/queryparsersyntax.html">here</a>.
######Parameters
* **name**: q  
**required**: true  
**description**: The search query supplied by the user  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  


---
####Resource: /sources
**Description** Information about sources.
**Base Path** http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources/sources.json
**Description** Source Listings
**Operations**
**Method** GET
**Nickname** getSources
**Notes** Returns the list of Campaigns.
######Parameters
* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: * Set of fields to sort the records by.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/sources/{id}.json
**Description** Information about a specific source.
**Operations**
**Method** GET
**Nickname** getSourceById
**Notes** Returns the Source identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the source to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  


---
####Resource: /tags
**Description** Information about tags
**Base Path** http://ctacdev.com:8090/Syndication/api/v2
#####End Points
**Path** /resources/tagTypes.{format}
**Description** List of Types
**Operations**
**Method** GET
**Nickname** getTagTypes
**Notes** Returns the list of TagTypes
######Parameters
**Path** /resources/tags.{format}
**Description** List of Tags
**Operations**
**Method** GET
**Nickname** getTags
**Notes** Returns the list of Tags matching the specified query parameters in the specified 'format'.
######Parameters
* **name**: sort  
**required**: false  
**description**: The name of the property to which sorting will be applied  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: Return records starting at the offset index.  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: name  
**required**: false  
**description**: Return tags[s] matching the supplied name  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: nameContains  
**required**: false  
**description**: Return tags which contain the supplied partial name.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

* **name**: syndicationId  
**required**: false  
**description**: Return tags associated with the supplied syndication id.  
**paramType**: query  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: typeId  
**required**: false  
**description**: Return tags belonging to the supplied tag type id.  
**paramType**: query  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: typeName  
**required**: false  
**description**: Return tags belonging to the supplied tag type name.  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/tags/{id}.{format}
**Description** Information about a specific tag
**Operations**
**Method** GET
**Nickname** getTagById
**Notes** Returns the Tag identified by the 'id' in the specified 'format'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the record to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/tags/{id}/media.{format}
**Description** MediaItem
**Operations**
**Method** GET
**Nickname** getMediaByTagId
**Notes** Returns the list of MediaItems associated with the Tag identified by the 'id'.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the record to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: The name of the property to which sorting will be applied  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  

**Path** /resources/tags/{id}/related.{format}
**Description** Information about related tags to a specific tag
**Operations**
**Method** GET
**Nickname** getRelatedTagsById
**Notes** Returns the list of Tags related to the Tag identified by the 'id' in the specified format.
######Parameters
* **name**: id  
**required**: true  
**description**: The id of the tag to look up  
**paramType**: path  
**type**: integer  
**format**: int64  
**defaultValue**:   
**allowMultiple**: false  

* **name**: max  
**required**: false  
**description**: The maximum number of records to return  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: offset  
**required**: false  
**description**: The offset of the records set to return for pagination  
**paramType**: query  
**type**: integer  
**format**: int32  
**defaultValue**:   
**allowMultiple**: false  

* **name**: sort  
**required**: false  
**description**: The name of the property to which sorting will be applied  
**paramType**: query  
**type**: string  
**format**: null  
**defaultValue**:   
**allowMultiple**: false  


---
