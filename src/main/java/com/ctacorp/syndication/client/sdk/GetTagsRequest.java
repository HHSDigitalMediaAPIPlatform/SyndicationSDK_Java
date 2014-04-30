package com.ctacorp.syndication.client.sdk;

public class GetTagsRequest {

    private String name;
    private String nameContains;
    private Long syndicationId;
    private Long typeId;
    private String typeName;

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

    public Long getSyndicationId() {
        return syndicationId;
    }

    public void setSyndicationId(Long syndicationId) {
        this.syndicationId = syndicationId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
