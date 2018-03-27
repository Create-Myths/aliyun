package com.qf.dto;

import java.util.Date;

public class BalancerDTO {
    private Long id;
    private String name;
    private Long regionId;
    private Long userId;
    private String bindWidth;
    private String out_ip;
    private Integer port;
    private Short state;
    private Date create_time;
    private Date end_time;
    private String line;
    private String region;
    private Integer buyType;
    private Integer buyCount;
    private Integer bindwidth;
    private Integer bport;
    private Integer kepp_alive;
    private Integer heath_check;
    private Integer role_type;
    private String url;
    private String pool;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBindWidth() {
        return bindWidth;
    }

    public void setBindWidth(String bindWidth) {
        this.bindWidth = bindWidth;
    }

    public String getOut_ip() {
        return out_ip;
    }

    public void setOut_ip(String out_ip) {
        this.out_ip = out_ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getBindwidth() {
        return bindwidth;
    }

    public void setBindwidth(Integer bindwidth) {
        this.bindwidth = bindwidth;
    }

    public Integer getBport() {
        return bport;
    }

    public void setBport(Integer bport) {
        this.bport = bport;
    }

    public Integer getKepp_alive() {
        return kepp_alive;
    }

    public void setKepp_alive(Integer kepp_alive) {
        this.kepp_alive = kepp_alive;
    }

    public Integer getHeath_check() {
        return heath_check;
    }

    public void setHeath_check(Integer heath_check) {
        this.heath_check = heath_check;
    }

    public Integer getRole_type() {
        return role_type;
    }

    public void setRole_type(Integer role_type) {
        this.role_type = role_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }
}
