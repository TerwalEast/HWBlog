package com.noname.HWBlog.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * article
 * @author 
 */
@Data
public class Article implements Serializable {

    public Article(Integer userId,String title,String text,Date date)
    {
        this.userId = userId;
        this.title = title;
        this.text = text;
        this.state = 0;
        this.createTime = date;
        this.modifyTime = date;
    }

    private Integer id;

    private Integer userId;

    private String title;

    private Date modifyTime;

    private Date createTime;

    private String text;

    private Byte state;

    private static final long serialVersionUID = 1L;

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public void setText(String text) {
        this.text = text;
    }
}