package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.common.ApiException;
import com.ctacorp.syndication.client.model.*;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class ResourcesApi {

    private com.ctacorp.syndication.client.api.ResourcesApi resourcesApi = new com.ctacorp.syndication.client.api.ResourcesApi();
    private Pagination pagination = new Pagination();

    public ResourcesApi() {
        Properties properties = null;
        try {
            properties = PropertiesLoaderUtils.loadAllProperties("sdk.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setBasePath((String) properties.get("api.base.url"));
    }

    public void setBasePath(String basePath) {
        resourcesApi.setBasePath(basePath);
    }

    public Resources getResources(String query) throws ApiException {
        return resourcesApi.getResources(query);
    }

    public Campaigns getCampaigns() throws ApiException {
        return getCampaigns(pagination);
    }

    public Campaigns getCampaigns(Pagination pagination) throws ApiException {
        return resourcesApi.getCampaigns(pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public MediaItems getMediaByCampaignId(Long id, Pagination pagination) throws ApiException {
        return resourcesApi.getMediaByCampaignId(id, pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public MediaItems getMediaByCampaignId(Long id) throws ApiException {
        return getMediaByCampaignId(id, pagination);
    }

    public Campaigns getCampaignById(Long id) throws ApiException {
        return resourcesApi.getCampaignById(id);
    }

    public Languages getLanguages(Pagination pagination) throws ApiException {
        return resourcesApi.getLanguages(pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public Languages getLanguages() throws ApiException {
        return getLanguages(pagination);
    }

    public Languages getLanguageById(Long id) throws ApiException {
        return resourcesApi.getLanguageById(id);
    }

    public TagTypes getTagTypes() throws ApiException {
        return resourcesApi.getTagTypes();
    }

    public TagLists getTags(PorkMasters request, Pagination pagination) throws ApiException {
        return resourcesApi.getTags(pagination.getSort(), pagination.getMax(), pagination.getOffset(), request.getName(), request.getNameContains(), request.getSyndicationId(), request.getTypeId(), request.getTypeName());
    }

    public TagLists getTags(PorkMasters request) throws ApiException {
        return getTags(request, pagination);
    }

    public Tags getTagById(Long id) throws ApiException {
        return resourcesApi.getTagById(id);
    }

    public MediaItems getMediaByTagId(Long id) throws ApiException {
        return getMediaByTagId(id, pagination);
    }

    public MediaItems getMediaByTagId(Long id, Pagination pagination) throws ApiException {
        return resourcesApi.getMediaByTagId(id, pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public TagLists getRelatedTagsById(Long id) throws ApiException {
        return getRelatedTagsById(id, pagination);
    }

    public TagLists getRelatedTagsById(Long id, Pagination pagination) throws ApiException {
        return resourcesApi.getRelatedTagsById(id, pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public Sources getSources() throws ApiException {
        return getSources(pagination);
    }

    public Sources getSources(Pagination pagination) throws ApiException {
        return resourcesApi.getSources(pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public Sources getSourceById(Long id) throws ApiException {
        return resourcesApi.getSourceById(id);
    }

    public MediaTypes getMediaTypes() throws ApiException {
        return resourcesApi.getMediaTypes();
    }

    public MediaItems getMedia(GetMediaRequest request) throws ApiException {
        return getMedia(request, pagination);
    }

    public MediaItems getMedia(GetMediaRequest request, Pagination pagination) throws ApiException {
        return resourcesApi.getMedia(pagination.getMax(), pagination.getOffset(), pagination.getSort(),
            request.getMediaTypes(), request.getName(), request.getNameContains(), request.getDescriptionContains(),
            request.getSourceUrl(), request.getSourceUrlContains(), request.getContentAuthored(),
            request.getContentUpdated(), request.getContentPublished(), request.getContentReviewed(),
            request.getSyndicationCaptured(), request.getSyndicationUpdated(), request.getContentAuthoredSinceDate(),
            request.getContentAuthoredBeforeDate(), request.getContentAuthoredInRange(), request.getContentUpdatedSinceDate(),
            request.getContentUpdatedBeforeDate(), request.getContentUpdatedInRange(), request.getContentPublishedSinceDate(),
            request.getContentPublishedBeforeDate(), request.getContentPublishedInRange(), request.getContentReviewedSinceDate(),
            request.getContentReviewedBeforeDate(), request.getContentReviewedInRange(), request.getSyndicationCapturedSinceDate(),
            request.getSyndicationCapturedBeforeDate(), request.getSyndicationCapturedInRange(),
            request.getSyndicationUpdatedSinceDate(), request.getSyndicationUpdatedBeforeDate(), request.getSyndicationUpdatedInRange(),
            request.getSyndicationVisibleSinceDate(), request.getSyndicationVisibleBeforeDate(), request.getSyndicationVisibleInRange(),
            request.getLanguageId(), request.getLanguageName(), request.getLanguageIsoCode(), request.getHash(), request.getHashContains(),
            request.getSourceId(), request.getSourceName(), request.getSourceNameContains(), request.getSourceAcronym(),
            request.getSourceAcronymContains(), request.getTagIds(), request.getRestrictToSet());
    }

    public MediaItems getMostPopularMediaItems() throws ApiException {
        return getMostPopularMediaItems(pagination);
    }

    public MediaItems getMostPopularMediaItems(Pagination pagination) throws ApiException {
        return resourcesApi.getMostPopularMedia(pagination.getMax(), pagination.getOffset());
    }

    public MediaItems searchMedia(String query) throws ApiException {
        return searchMedia(query, pagination);
    }

    public MediaItems searchMedia(String query, Pagination pagination) throws ApiException {
        return resourcesApi.searchMedia(query, pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public MediaItems getMediaById(Long id) throws ApiException {
        return resourcesApi.getMediaById(id);
    }

    public String getMediaContentById(Long id) throws ApiException {
        return resourcesApi.getMediaContentById(id);
    }

    public String getMediaPreviewById(Long id, ImageProperties imageProperties) throws ApiException {
        return resourcesApi.getMediaPreviewById(id, imageProperties.getImageFloat(), imageProperties.getImageMargin(), imageProperties.getPreviewSize(), imageProperties.getWidth(), imageProperties.getHeight(), imageProperties.getCrop());
    }

    public String getMediaPreviewById(Long id) throws ApiException {
        return getMediaPreviewById(id, new ImageProperties());
    }

    public EmbedCode getMediaEmbedById(Long id) throws ApiException {
        return getMediaEmbedById(id, new EmbedProperties());
    }

    public EmbedCode getMediaEmbedById(Long id, EmbedProperties embedProperties) throws ApiException {
        return resourcesApi.getMediaEmbedById(id, embedProperties.getFlavor(), embedProperties.getWidth(), embedProperties.getHeight(), embedProperties.getIframeName(), embedProperties.getExcludeJquery(), embedProperties.getExcludeDiv(), embedProperties.getDivId());
    }

    public Ratings getMediaRatingsById(Long id) throws ApiException {
        return resourcesApi.getMediaRatingsById(id);
    }

    public MediaItems getRelatedMediaById(Long id) throws ApiException {
        return getRelatedMediaById(id, pagination);
    }

    public MediaItems getRelatedMediaById(Long id, Pagination pagination) throws ApiException {
        return resourcesApi.getRelatedMediaById(id, pagination.getMax(), pagination.getOffset(), pagination.getSort());
    }

    public SyndicatedMediaItems getMediaSyndicateById(Long id, SyndicateProperties syndicateProperties) throws ApiException {
        return resourcesApi.getMediaSyndicateById(id, syndicateProperties.getStripStyles(),
                syndicateProperties.getStripScripts(), syndicateProperties.getStripImages(),
                syndicateProperties.getStripBreaks(), syndicateProperties.getStripClasses(),
                syndicateProperties.getFontsize(), syndicateProperties.getImageFloat(),
                syndicateProperties.getImageMargin(), syndicateProperties.getAutoplay(),
                syndicateProperties.getRel(), syndicateProperties.getCssClass());
    }

    public SyndicatedMediaItems getMediaSyndicateById(Long id) throws ApiException {
        return getMediaSyndicateById(id, new SyndicateProperties());
    }

    public YoutubeMetadata getMediaYoutubeMetaDataById(Long id) throws ApiException {
        return resourcesApi.getMediaYoutubeMetaDataById(id);
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
