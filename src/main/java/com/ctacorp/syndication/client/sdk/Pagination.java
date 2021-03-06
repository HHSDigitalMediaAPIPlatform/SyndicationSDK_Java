package com.ctacorp.syndication.client.sdk;

public class Pagination {

    private Integer max;
    private Integer offset;
    private String sort;

    public Pagination() {
    }

    public Pagination(Integer max, Integer offset, String sort) {
        this.max = max;
        this.offset = offset;
        this.sort = sort;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
