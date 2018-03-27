package com.qf.pojo;

import java.util.Date;

public class YunMemery {
    private Long mid;

    private Long hid;

    private String memname;

    private String memsize;

    private String targetip;

    private String tport;

    private String sourceip;

    private Short memtype;

    private Integer buynum;

    private Integer buytype;

    private Integer buytime;

    private Date createtime;

    private Date periodtime;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public String getMemsize() {
        return memsize;
    }

    public void setMemsize(String memsize) {
        this.memsize = memsize;
    }

    public String getTargetip() {
        return targetip;
    }

    public void setTargetip(String targetip) {
        this.targetip = targetip;
    }

    public String getTport() {
        return tport;
    }

    public void setTport(String tport) {
        this.tport = tport;
    }

    public String getSourceip() {
        return sourceip;
    }

    public void setSourceip(String sourceip) {
        this.sourceip = sourceip;
    }

    public Short getMemtype() {
        return memtype;
    }

    public void setMemtype(Short memtype) {
        this.memtype = memtype;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getPeriodtime() {
        return periodtime;
    }

    public void setPeriodtime(Date periodtime) {
        this.periodtime = periodtime;
    }
}