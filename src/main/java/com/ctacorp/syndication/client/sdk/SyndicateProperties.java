package com.ctacorp.syndication.client.sdk;

public class SyndicateProperties {

    private Boolean stripStyles;
    private Boolean stripScripts; 
    private Boolean stripImages; 
    private Boolean stripBreaks; 
    private Boolean stripClasses; 
    private Integer fontsize; 
    private String imageFloat; 
    private String imageMargin; 
    private Boolean autoplay; 
    private Boolean rel; 
    private String cssClass;

    public Boolean getStripStyles() {
        return stripStyles;
    }

    public void setStripStyles(Boolean stripStyles) {
        this.stripStyles = stripStyles;
    }

    public Boolean getStripScripts() {
        return stripScripts;
    }

    public void setStripScripts(Boolean stripScripts) {
        this.stripScripts = stripScripts;
    }

    public Boolean getStripImages() {
        return stripImages;
    }

    public void setStripImages(Boolean stripImages) {
        this.stripImages = stripImages;
    }

    public Boolean getStripBreaks() {
        return stripBreaks;
    }

    public void setStripBreaks(Boolean stripBreaks) {
        this.stripBreaks = stripBreaks;
    }

    public Boolean getStripClasses() {
        return stripClasses;
    }

    public void setStripClasses(Boolean stripClasses) {
        this.stripClasses = stripClasses;
    }

    public Integer getFontsize() {
        return fontsize;
    }

    public void setFontsize(Integer fontsize) {
        this.fontsize = fontsize;
    }

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

    public Boolean getAutoplay() {
        return autoplay;
    }

    public void setAutoplay(Boolean autoplay) {
        this.autoplay = autoplay;
    }

    public Boolean getRel() {
        return rel;
    }

    public void setRel(Boolean rel) {
        this.rel = rel;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }
}
