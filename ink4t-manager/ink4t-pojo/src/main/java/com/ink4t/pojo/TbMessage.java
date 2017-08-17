package com.ink4t.pojo;

import java.util.Date;

public class TbMessage {
    private Integer id;

    private Integer replyId;

    private String mname;

    private String memail;

    private String mcontext;

    private Date mdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail == null ? null : memail.trim();
    }

    public String getMcontext() {
        return mcontext;
    }

    public void setMcontext(String mcontext) {
        this.mcontext = mcontext == null ? null : mcontext.trim();
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }
}