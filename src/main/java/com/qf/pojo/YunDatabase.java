package com.qf.pojo;

import java.util.Date;

public class YunDatabase {
    private Long dbid;

    private Long uid;

    private Long dbtypeid;

    private String dbname;

    private String dbmem;

    private String dbdisksize;

    private Integer buynum;

    private Integer buytype;

    private Integer buytime;

    private Date periodtime;

    private Short dbstatus;

    private String dbip;

    private Date createtime;

    public Long getDbid() {
        return dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getDbtypeid() {
        return dbtypeid;
    }

    public void setDbtypeid(Long dbtypeid) {
        this.dbtypeid = dbtypeid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getDbmem() {
        return dbmem;
    }

    public void setDbmem(String dbmem) {
        this.dbmem = dbmem;
    }

    public String getDbdisksize() {
        return dbdisksize;
    }

    public void setDbdisksize(String dbdisksize) {
        this.dbdisksize = dbdisksize;
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

    public Short getDbstatus() {
        return dbstatus;
    }

    public void setDbstatus(Short dbstatus) {
        this.dbstatus = dbstatus;
    }

    public String getDbip() {
        return dbip;
    }

    public void setDbip(String dbip) {
        this.dbip = dbip;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}