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
    private Integer id;

    private Integer userId;

    private String title;

    private Date modifyTime;

    private Date createTime;

    private String text;

    private Byte state;

    private static final long serialVersionUID = 1L;
}