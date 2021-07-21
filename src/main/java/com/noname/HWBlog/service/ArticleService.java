package com.noname.HWBlog.service;

import com.noname.HWBlog.dao.ArticleDao;
import com.noname.HWBlog.dao.ArticleLabelDao;
import com.noname.HWBlog.dao.LabelDao;
import com.noname.HWBlog.model.Article;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ArticleService {
    @Resource
    ArticleDao articleDao;
    @Resource
    LabelDao labelDao;
    @Resource
    ArticleLabelDao articleLabelDao;

    public Article getArticleById(int id)
    {
        return articleDao.selectByPrimaryKey(id);
    }

    public List<Article> getArticlesByLabelName(String label)
    {
        Integer labelId = labelDao.getIdByName(label);
        List<Integer> articleIdList = articleLabelDao.getArticleIdsByLabelId(labelId);
        List<Article> articleList = new LinkedList<Article>();
        for(int i = 0; i < articleIdList.size(); i++)
        {
            articleList.add(articleDao.getArticleById(articleIdList.get(i)));
        }
        return articleList;
    }

    public void createArticle(Integer user_Id, String title,String text)
    {
        Date currentTime = new Date();
        Article article = new Article(user_Id,title,text,currentTime);
        articleDao.insert(article);
    }

    public List<Article> getRecentArticles(Integer amount)
    {
        List<Article> list= articleDao.selectRecentArticles(amount);
        return list;
    }

    public void deleteArticleById(Integer id)
    {
        articleDao.deleteArticleById(id);
    }



}
