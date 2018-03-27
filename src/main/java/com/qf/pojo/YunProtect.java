package com.qf.pojo;

import java.util.Date;

public class YunProtect {
    private Long protectid;

    private String protectname;

    private Date createtime;

    public Long getProtectid() {
        return protectid;
    }

    public void setProtectid(Long protectid) {
        this.protectid = protectid;
    }

    public String getProtectname() {
        return protectname;
    }

    public void setProtectname(String protectname) {
        this.protectname = protectname;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}