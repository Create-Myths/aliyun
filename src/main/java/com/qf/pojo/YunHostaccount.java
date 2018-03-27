package com.qf.pojo;

import java.util.Date;

public class YunHostaccount {
    private Long accountid;

    private String hostname;

    private String managername;

    private String managerpass;

    private Date createtime;

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getManagerpass() {
        return managerpass;
    }

    public void setManagerpass(String managerpass) {
        this.managerpass = managerpass;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}