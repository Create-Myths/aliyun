package com.qf.pojo;

import java.util.Date;

public class YunWorklist {
    private Long workid;

    private Long worktypeid;

    private String problemcontent;

    private Date committime;

    private Short workstate;

    private String operation;

    public Long getWorkid() {
        return workid;
    }

    public void setWorkid(Long workid) {
        this.workid = workid;
    }

    public Long getWorktypeid() {
        return worktypeid;
    }

    public void setWorktypeid(Long worktypeid) {
        this.worktypeid = worktypeid;
    }

    public String getProblemcontent() {
        return problemcontent;
    }

    public void setProblemcontent(String problemcontent) {
        this.problemcontent = problemcontent;
    }

    public Date getCommittime() {
        return committime;
    }

    public void setCommittime(Date committime) {
        this.committime = committime;
    }

    public Short getWorkstate() {
        return workstate;
    }

    public void setWorkstate(Short workstate) {
        this.workstate = workstate;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}