package com.ctacorp.syndication.client.sdk;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetMediaRequest {

    private String mediaTypes;
    private String name;
    private String nameContains;
    private String descriptionContains;
    private String sourceUrl;
    private String sourceUrlContains;
    private Date contentAuthored;
    private Date contentUpdated;
    private Date contentPublished;
    private Date contentReviewed;
    private Date syndicationCaptured;
    private Date syndicationUpdated;
    private Date contentAuthoredSinceDate;
    private Date contentAuthoredBeforeDate;
    private String contentAuthoredInRange;
    private Date contentUpdatedSinceDate;
    private Date contentUpdatedBeforeDate;
    private String contentUpdatedInRange;
    private Date contentPublishedSinceDate;
    private Date contentPublishedBeforeDate;
    private String contentPublishedInRange;
    private Date contentReviewedSinceDate;
    private Date contentReviewedBeforeDate;
    private String contentReviewedInRange;
    private Date syndicationCapturedSinceDate;
    private Date syndicationCapturedBeforeDate;
    private String syndicationCapturedInRange;
    private Date syndicationUpdatedSinceDate;
    private Date syndicationUpdatedBeforeDate;
    private String syndicationUpdatedInRange;
    private Date syndicationVisibleSinceDate;
    private Date syndicationVisibleBeforeDate;
    private String syndicationVisibleInRange;
    private Long languageId;
    private String languageName;
    private String languageIsoCode;
    private String hash;
    private String hashContains;
    private Long sourceId;
    private String sourceName;
    private String sourceNameContains;
    private String sourceAcronym;
    private String sourceAcronymContains;
    private String tagIds;
    private String restrictToSet;

    public GetMediaRequest() {
    }

    public GetMediaRequest(MediaType mediaType) {
        this.mediaTypes = mediaType.getMediaType();
    }

    public GetMediaRequest(MediaType ... mediaTypes) {
        List<String> mediaTypeList = new ArrayList<String>();
        for (MediaType mediaType : mediaTypes) {
            mediaTypeList.add(mediaType.getMediaType());
        }
        this.mediaTypes = StringUtils.join(mediaTypeList, ",");
    }

    public String getMediaTypes() {
        return mediaTypes;
    }

    public void setMediaTypes(String mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourceUrlContains() {
        return sourceUrlContains;
    }

    public void setSourceUrlContains(String sourceUrlContains) {
        this.sourceUrlContains = sourceUrlContains;
    }

    public Date getContentAuthored() {
        return contentAuthored;
    }

    public void setContentAuthored(Date contentAuthored) {
        this.contentAuthored = contentAuthored;
    }

    public Date getContentUpdated() {
        return contentUpdated;
    }

    public void setContentUpdated(Date contentUpdated) {
        this.contentUpdated = contentUpdated;
    }

    public Date getContentPublished() {
        return contentPublished;
    }

    public void setContentPublished(Date contentPublished) {
        this.contentPublished = contentPublished;
    }

    public Date getContentReviewed() {
        return contentReviewed;
    }

    public void setContentReviewed(Date contentReviewed) {
        this.contentReviewed = contentReviewed;
    }

    public Date getSyndicationCaptured() {
        return syndicationCaptured;
    }

    public void setSyndicationCaptured(Date syndicationCaptured) {
        this.syndicationCaptured = syndicationCaptured;
    }

    public Date getSyndicationUpdated() {
        return syndicationUpdated;
    }

    public void setSyndicationUpdated(Date syndicationUpdated) {
        this.syndicationUpdated = syndicationUpdated;
    }

    public Date getContentAuthoredSinceDate() {
        return contentAuthoredSinceDate;
    }

    public void setContentAuthoredSinceDate(Date contentAuthoredSinceDate) {
        this.contentAuthoredSinceDate = contentAuthoredSinceDate;
    }

    public Date getContentAuthoredBeforeDate() {
        return contentAuthoredBeforeDate;
    }

    public void setContentAuthoredBeforeDate(Date contentAuthoredBeforeDate) {
        this.contentAuthoredBeforeDate = contentAuthoredBeforeDate;
    }

    public String getContentAuthoredInRange() {
        return contentAuthoredInRange;
    }

    public void setContentAuthoredInRange(String contentAuthoredInRange) {
        this.contentAuthoredInRange = contentAuthoredInRange;
    }

    public Date getContentUpdatedSinceDate() {
        return contentUpdatedSinceDate;
    }

    public void setContentUpdatedSinceDate(Date contentUpdatedSinceDate) {
        this.contentUpdatedSinceDate = contentUpdatedSinceDate;
    }

    public Date getContentUpdatedBeforeDate() {
        return contentUpdatedBeforeDate;
    }

    public void setContentUpdatedBeforeDate(Date contentUpdatedBeforeDate) {
        this.contentUpdatedBeforeDate = contentUpdatedBeforeDate;
    }

    public String getContentUpdatedInRange() {
        return contentUpdatedInRange;
    }

    public void setContentUpdatedInRange(String contentUpdatedInRange) {
        this.contentUpdatedInRange = contentUpdatedInRange;
    }

    public Date getContentPublishedSinceDate() {
        return contentPublishedSinceDate;
    }

    public void setContentPublishedSinceDate(Date contentPublishedSinceDate) {
        this.contentPublishedSinceDate = contentPublishedSinceDate;
    }

    public Date getContentPublishedBeforeDate() {
        return contentPublishedBeforeDate;
    }

    public void setContentPublishedBeforeDate(Date contentPublishedBeforeDate) {
        this.contentPublishedBeforeDate = contentPublishedBeforeDate;
    }

    public String getContentPublishedInRange() {
        return contentPublishedInRange;
    }

    public void setContentPublishedInRange(String contentPublishedInRange) {
        this.contentPublishedInRange = contentPublishedInRange;
    }

    public Date getContentReviewedSinceDate() {
        return contentReviewedSinceDate;
    }

    public void setContentReviewedSinceDate(Date contentReviewedSinceDate) {
        this.contentReviewedSinceDate = contentReviewedSinceDate;
    }

    public Date getContentReviewedBeforeDate() {
        return contentReviewedBeforeDate;
    }

    public void setContentReviewedBeforeDate(Date contentReviewedBeforeDate) {
        this.contentReviewedBeforeDate = contentReviewedBeforeDate;
    }

    public String getContentReviewedInRange() {
        return contentReviewedInRange;
    }

    public void setContentReviewedInRange(String contentReviewedInRange) {
        this.contentReviewedInRange = contentReviewedInRange;
    }

    public Date getSyndicationCapturedSinceDate() {
        return syndicationCapturedSinceDate;
    }

    public void setSyndicationCapturedSinceDate(Date syndicationCapturedSinceDate) {
        this.syndicationCapturedSinceDate = syndicationCapturedSinceDate;
    }

    public Date getSyndicationCapturedBeforeDate() {
        return syndicationCapturedBeforeDate;
    }

    public void setSyndicationCapturedBeforeDate(Date syndicationCapturedBeforeDate) {
        this.syndicationCapturedBeforeDate = syndicationCapturedBeforeDate;
    }

    public String getSyndicationCapturedInRange() {
        return syndicationCapturedInRange;
    }

    public void setSyndicationCapturedInRange(String syndicationCapturedInRange) {
        this.syndicationCapturedInRange = syndicationCapturedInRange;
    }

    public Date getSyndicationUpdatedSinceDate() {
        return syndicationUpdatedSinceDate;
    }

    public void setSyndicationUpdatedSinceDate(Date syndicationUpdatedSinceDate) {
        this.syndicationUpdatedSinceDate = syndicationUpdatedSinceDate;
    }

    public Date getSyndicationUpdatedBeforeDate() {
        return syndicationUpdatedBeforeDate;
    }

    public void setSyndicationUpdatedBeforeDate(Date syndicationUpdatedBeforeDate) {
        this.syndicationUpdatedBeforeDate = syndicationUpdatedBeforeDate;
    }

    public String getSyndicationUpdatedInRange() {
        return syndicationUpdatedInRange;
    }

    public void setSyndicationUpdatedInRange(String syndicationUpdatedInRange) {
        this.syndicationUpdatedInRange = syndicationUpdatedInRange;
    }

    public Date getSyndicationVisibleSinceDate() {
        return syndicationVisibleSinceDate;
    }

    public void setSyndicationVisibleSinceDate(Date syndicationVisibleSinceDate) {
        this.syndicationVisibleSinceDate = syndicationVisibleSinceDate;
    }

    public Date getSyndicationVisibleBeforeDate() {
        return syndicationVisibleBeforeDate;
    }

    public void setSyndicationVisibleBeforeDate(Date syndicationVisibleBeforeDate) {
        this.syndicationVisibleBeforeDate = syndicationVisibleBeforeDate;
    }

    public String getSyndicationVisibleInRange() {
        return syndicationVisibleInRange;
    }

    public void setSyndicationVisibleInRange(String syndicationVisibleInRange) {
        this.syndicationVisibleInRange = syndicationVisibleInRange;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageIsoCode() {
        return languageIsoCode;
    }

    public void setLanguageIsoCode(String languageIsoCode) {
        this.languageIsoCode = languageIsoCode;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHashContains() {
        return hashContains;
    }

    public void setHashContains(String hashContains) {
        this.hashContains = hashContains;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceNameContains() {
        return sourceNameContains;
    }

    public void setSourceNameContains(String sourceNameContains) {
        this.sourceNameContains = sourceNameContains;
    }

    public String getSourceAcronym() {
        return sourceAcronym;
    }

    public void setSourceAcronym(String sourceAcronym) {
        this.sourceAcronym = sourceAcronym;
    }

    public String getSourceAcronymContains() {
        return sourceAcronymContains;
    }

    public void setSourceAcronymContains(String sourceAcronymContains) {
        this.sourceAcronymContains = sourceAcronymContains;
    }

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getRestrictToSet() {
        return restrictToSet;
    }

    public void setRestrictToSet(String restrictToSet) {
        this.restrictToSet = restrictToSet;
    }
}
