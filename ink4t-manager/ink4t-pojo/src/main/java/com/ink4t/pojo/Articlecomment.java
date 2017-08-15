package com.ink4t.pojo;

import java.util.Date;

public class Articlecomment extends ArticlecommentKey {
    private Integer acaid;

    private String acname;

    private String acemail;

    private String accontext;

    private Date acdate;

    public Integer getAcaid() {
        return acaid;
    }

    public void setAcaid(Integer acaid) {
        this.acaid = acaid;
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