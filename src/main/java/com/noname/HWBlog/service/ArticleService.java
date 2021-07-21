package com.noname.HWBlog.service;

import com.noname.HWBlog.dao.ArticleDao;
import com.noname.HWBlog.model.Article;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

public class ArticleService {
    @Resource
    ArticleDao articleDao;

    public Article getArticleById(int id)
    {
        return articleDao.selectByPrimaryKey(id);
    }

    public List<Article> getArticlesByCategoryName(String category)
    {
        return articleDao.getArticlesByCategoryName(category);
    }

    public void writeBlog(Article article)
    {
        article.setSummary(article.getContent().substring(0, 100)+"...........");
        articleDao.writeBlog(article);
    }

    public List<Category> getCategories()
    {
        return articleDao.getCategories();
    }

    public List<Comment> findCommentsByArticleId(Integer id)
    {
        return articleDao.findCommentsByArticleId(id);
    }

    public void saveComment(Comment comment)
    {
        articleDao.saveComment(comment);
    }

    public void deleteComment(Integer id)
    {
        articleDao.deleteComment(id);
    }

    public Integer findArticleidByCommentid(Integer id)
    {
        return articleDao.findArticleidByCommentid(id);
    }

    public void deleteArticleById(Integer id)
    {
        articleDao.deleteArticleById(id);
    }

    public void updateVisitByArticleId(Integer id)
    {
        articleDao.updateVisitByArticleId(id);
    }

    public void addCategory(Category category)
    {
        articleDao.addCategory(category);
    }




}
