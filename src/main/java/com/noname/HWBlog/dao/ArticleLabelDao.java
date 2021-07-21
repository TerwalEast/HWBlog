package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.ArticleLabel;

public interface ArticleLabelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleLabel record);

    int insertSelective(ArticleLabel record);

    ArticleLabel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleLabel record);

    int updateByPrimaryKey(ArticleLabel record);
}