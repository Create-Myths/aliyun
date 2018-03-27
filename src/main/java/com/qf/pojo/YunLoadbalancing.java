package com.qf.pojo;

import java.util.Date;

public class YunLoadbalancing {
    private Long loadid;

    private Short line;

    private String bandwidth;

    private Integer buynum;

    private Integer buytype;

    private Integer buytime;

    private Date periodtime;

    private String loadname;

    private String domain;

    private Integer monitorport;

    private String fowardrule;

    private Short keepsession;

    private Short checkhealth;

    private Long uid;

    private String pool;

    private Date createtime;

    private String outip;

    public Long getLoadid() {
        return loadid;
    }

    public void setLoadid(Long loadid) {
        this.loadid = loadid;
    }

    public Short getLine() {
        return line;
    }

    public void setLine(Short line) {
        this.line = line;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public Integer getBuytype() {
        return buytype;
    }

    public void setBuytype(Integer buytype) {
        this.buytype = buytype;
    }

    public Integer getBuytime() {
        return buytime;
    }

    public void setBuytime(Integer buytime) {
        this.buytime = buytime;
    }

    public Date getPeriodtime() {
        return periodtime;
    }

    public void setPeriodtime(Date periodtime) {
        this.periodtime = periodtime;
    }

    public String getLoadname() {
        return loadname;
    }

    public void setLoadname(String loadname) {
        this.loadname = loadname;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getMonitorport() {
        return monitorport;
    }

    public void setMonitorport(Integer monitorport) {
        this.monitorport = monitorport;
    }

    public String getFowardrule() {
        return fowardrule;
    }

    public void setFowardrule(String fowardrule) {
        this.fowardrule = fowardrule;
    }

    public Short getKeepsession() {
        return keepsession;
    }

    public void setKeepsession(Short keepsession) {
        this.keepsession = keepsession;
    }

    public Short getCheckhealth() {
        return checkhealth;
    }

    public void setCheckhealth(Short checkhealth) {
        this.checkhealth = checkhealth;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getOutip() {
        return outip;
    }

    public void setOutip(String outip) {
        this.outip = outip;
    }
}