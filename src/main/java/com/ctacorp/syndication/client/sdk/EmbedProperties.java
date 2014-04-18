package com.ctacorp.syndication.client.sdk;

public class EmbedProperties {

    private Long id;
    private String flavor;
    private Integer width;
    private Integer height;
    private String iframeName;
    private Boolean excludeJquery;
    private Boolean excludeDiv;
    private String divId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
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

    public String getIframeName() {
        return iframeName;
    }

    public void setIframeName(String iframeName) {
        this.iframeName = iframeName;
    }

    public Boolean getExcludeJquery() {
        return excludeJquery;
    }

    public void setExcludeJquery(Boolean excludeJquery) {
        this.excludeJquery = excludeJquery;
    }

    public Boolean getExcludeDiv() {
        return excludeDiv;
    }

    public void setExcludeDiv(Boolean excludeDiv) {
        this.excludeDiv = excludeDiv;
    }

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }
}
