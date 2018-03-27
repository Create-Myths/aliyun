package com.qf.dto;

import java.util.Date;

public class DatabaseDTO {
    private Long id;
    private String db_name;
    private String db_type;
    private String pay_type;
    private String disk;
    private String port;
    private Short status;
    private Date maturity_month;
    private String ip;
    private Date valid_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDb_name() {
        return db_name;
    }

    public void setDb_name(String db_name) {
        this.db_name = db_name;
    }

    public String getDb_type() {
        return db_type;
    }

    public void setDb_type(String db_type) {
        this.db_type = db_type;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getMaturity_month() {
        return maturity_month;
    }

    public void setMaturity_month(Date maturity_month) {
        this.maturity_month = maturity_month;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getValid_time() {
        return valid_time;
    }

    public void setValid_time(Date valid_time) {
        this.valid_time = valid_time;
    }
}
