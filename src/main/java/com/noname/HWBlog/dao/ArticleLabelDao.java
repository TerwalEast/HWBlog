package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.ArticleLabel;

import java.util.List;

public interface ArticleLabelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleLabel record);

    int insertSelective(ArticleLabel record);

    ArticleLabel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleLabel record);

    int updateByPrimaryKey(ArticleLabel record);

    //Custom starts from here

    List<Integer> getArticleIdsByLabelId(Integer labelId);//从LabelID获取所有有这个Label的文章ID。


}