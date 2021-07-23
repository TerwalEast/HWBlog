package com.noname.HWBlog.service;

import com.noname.HWBlog.dao.*;
import com.noname.HWBlog.model.Article;
import com.noname.HWBlog.model.Sub;
import com.noname.HWBlog.model.User;
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
    @Resource
    UserDao userDao;
    @Resource
    SubDao subDao;


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

    public List<Article> getArticleByAuthorId(Integer author_id)
    {
        List<Article> list = articleDao.getArticleByAuthorId(Long.valueOf(author_id));
        return list;
    }

    public boolean updateArticle(Integer id, String title, String text, Byte state)
    {
        Article article = articleDao.getArticleById(id);
        if(article == null)
        {
            return false;
        }
        article.setTitle(title);
        article.setText(text);
        article.setState(state);
        Date date = new Date();
        article.setModifyTime(date);
        articleDao.updateArticle(article);
        return true;
    }

    public List<Article> getAllArticles()
    {
        return articleDao.getAllArticle();
    }

    public List<Article> queryByAuthorNameString(String namePrompt)
    {
        List<Integer> idList = userDao.getUserIDsThatNameContainString(namePrompt);

        if(idList.size() == 0)
        {
            return null;
        }

        List<Article> articleList = new LinkedList<Article>();

        for(int i = 0; i < idList.size(); i++)
        {
            articleList.add(articleDao.getArticleById(idList.get(i)));
        }
        return articleList;
    }

    public void subArticle(User user, Article article)
    {
        Sub sub = subDao.getSub(user.getId(),article.getId());
        if(sub != null)
        {
            subDao.enable(user.getId(),article.getId());
        }
        else
        {
            sub = new Sub();
            sub.setArticleId(article.getId());
            sub.setUserId(user.getId());
            sub.setValid(true);
        }
    }

    public void unsubArticle(User user, Article article)
    {
        Sub sub = subDao.getSub(user.getId(),article.getId());
        if(sub != null)
        {
            subDao.disable(user.getId(),article.getId());
        }
        else
        {
            //Do nothing
        }
    }



    public void complicatedQuery()
    {

    }


}
