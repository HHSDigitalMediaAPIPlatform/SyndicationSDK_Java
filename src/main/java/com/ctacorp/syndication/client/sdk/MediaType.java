package com.ctacorp.syndication.client.sdk;

public enum MediaType {

    MEDIA_ITEM("MediaItem"),IMAGE("Image"),HTML("Html"),AUDIO("Audio"),COLLECTION("Collection"),INFOGRAPHIC("Infographic"),SOCIALMEDIA("SocialMedia"),VIDEO("Video"),WIDGET("Widget");
    private String mediaType;

    MediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return this.mediaType;
    }
}
