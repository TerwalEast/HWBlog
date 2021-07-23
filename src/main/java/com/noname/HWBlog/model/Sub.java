package com.noname.HWBlog.model;

import java.io.Serializable;
import lombok.Data;

/**
 * sub
 * @author 
 */
@Data
public class Sub implements Serializable {
    private Integer userId;

    private Integer articleId;

    private Boolean isValid;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    private static final long serialVersionUID = 1L;
}