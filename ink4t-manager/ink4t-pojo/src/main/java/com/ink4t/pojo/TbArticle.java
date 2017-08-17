package com.ink4t.pojo;

import java.util.Date;

public class TbArticle {
    private Integer id;

    private String atitle;

    private String acontext;

    private Date adate;

    private String aauthor;

    private Integer readcount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAtitle() {
        return atitle;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle == null ? null : atitle.trim();
    }

    public String getAcontext() {
        return acontext;
    }

    public void setAcontext(String acontext) {
        this.acontext = acontext == null ? null : acontext.trim();
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public String getAauthor() {
        return aauthor;
    }

    public void setAauthor(String aauthor) {
        this.aauthor = aauthor == null ? null : aauthor.trim();
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }
}