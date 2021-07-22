package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.Article;
import com.noname.HWBlog.model.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleDao {
    long countByExample(ArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExample(ArticleExample example);

    Article selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    //Custom DAO starts here

    List<Article> selectRecentArticles(Integer amount);//选取最近几个文章，用于主页显示。amount是要求的数量。

    List<Article> getAllArticle();

    List<Article> getArticleByTitle(@Param("titleKeyword") String keyword);//关键词筛选

    List<Article> getArticleByAuthorId(@Param("uid") Long uid);//某作者所有文章

    Article getArticleById(@Param("id") Integer id);//文章详情

    void deleteArticleById(@Param("deleteId") Integer id);//删除文章，等于deleteByPrimaryKey()

    Integer getArticleCount();

    List<Article> getArticleByState(Byte state_pa);

    int updateArticle(Article record);


}