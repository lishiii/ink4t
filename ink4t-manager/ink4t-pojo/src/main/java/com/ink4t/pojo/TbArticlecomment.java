package com.ink4t.pojo;

import java.util.Date;

public class TbArticlecomment {
    private Integer id;

    private Integer replyId;

    private Integer articleId;

    private String acname;

    private String acemail;

    private String accontext;

    private Date acdate;

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

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname == null ? null : acname.trim();
    }

    public String getAcemail() {
        return acemail;
    }

    public void setAcemail(String acemail) {
        this.acemail = acemail == null ? null : acemail.trim();
    }

    public String getAccontext() {
        return accontext;
    }

    public void setAccontext(String accontext) {
        this.accontext = accontext == null ? null : accontext.trim();
    }

    public Date getAcdate() {
        return acdate;
    }

    public void setAcdate(Date acdate) {
        this.acdate = acdate;
    }
}