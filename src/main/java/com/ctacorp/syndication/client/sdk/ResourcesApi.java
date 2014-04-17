package com.ctacorp.syndication.client.sdk;

import com.ctacorp.syndication.client.common.ApiException;
import com.ctacorp.syndication.client.model.*;

public class ResourcesApi {

    private com.ctacorp.syndication.client.api.ResourcesApi resourcesApi = new com.ctacorp.syndication.client.api.ResourcesApi();
    private Pagination pagination = new Pagination();

    public ResourcesApi() {
        setBasePath(Constants.SYNDICATION_API_URL);
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

    public TagLists getTags(GetTagsRequest request, Pagination pagination) throws ApiException {
        return resourcesApi.getTags(pagination.getSort(), pagination.getMax(), pagination.getOffset(), request.getName(), request.getNameContains(), request.getSyndicationId(), request.getTypeId(), request.getTypeName());
    }

    public TagLists getTags(GetTagsRequest request) throws ApiException {
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

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
