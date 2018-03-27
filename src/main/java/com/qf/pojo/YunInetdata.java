package com.qf.pojo;

public class YunInetdata {
    private Long dataid;

    private Long datatypeid;

    private String inet;

    private String bandtype;

    private String bandwidth;

    public Long getDataid() {
        return dataid;
    }

    public void setDataid(Long dataid) {
        this.dataid = dataid;
    }

    public Long getDatatypeid() {
        return datatypeid;
    }

    public void setDatatypeid(Long datatypeid) {
        this.datatypeid = datatypeid;
    }

    public String getInet() {
        return inet;
    }

    public void setInet(String inet) {
        this.inet = inet;
    }

    public String getBandtype() {
        return bandtype;
    }

    public void setBandtype(String bandtype) {
        this.bandtype = bandtype;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }
}