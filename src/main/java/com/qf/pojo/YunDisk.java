package com.qf.pojo;

import java.util.Date;

public class YunDisk {
    private Long did;

    private Long hid;

    private String diskname;

    private String diskcapacity;

    private Date createtime;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getHid() {
        return hid;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public String getDiskname() {
        return diskname;
    }

    public void setDiskname(String diskname) {
        this.diskname = diskname;
    }

    public String getDiskcapacity() {
        return diskcapacity;
    }

    public void setDiskcapacity(String diskcapacity) {
        this.diskcapacity = diskcapacity;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}