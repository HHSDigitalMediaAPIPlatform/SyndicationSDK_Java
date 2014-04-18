package com.ctacorp.syndication.client.sdk;

public class ImageProperties {

    private String imageFloat;
    private String imageMargin;
    private String previewSize;
    private Integer width;
    private Integer height;
    private Boolean crop;

    public String getImageFloat() {
        return imageFloat;
    }

    public void setImageFloat(String imageFloat) {
        this.imageFloat = imageFloat;
    }

    public String getImageMargin() {
        return imageMargin;
    }

    public void setImageMargin(String imageMargin) {
        this.imageMargin = imageMargin;
    }

    public String getPreviewSize() {
        return previewSize;
    }

    public void setPreviewSize(String previewSize) {
        this.previewSize = previewSize;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getCrop() {
        return crop;
    }

    public void setCrop(Boolean crop) {
        this.crop = crop;
    }
}
