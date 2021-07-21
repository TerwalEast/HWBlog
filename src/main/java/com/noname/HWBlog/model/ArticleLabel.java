package com.noname.HWBlog.model;

import java.io.Serializable;
import lombok.Data;

/**
 * article_label
 * @author 
 */
@Data
public class ArticleLabel implements Serializable {
    private Integer id;

    private Integer articleId;

    private Integer labelId;

    private static final long serialVersionUID = 1L;
}