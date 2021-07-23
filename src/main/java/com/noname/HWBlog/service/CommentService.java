package com.noname.HWBlog.service;

import com.noname.HWBlog.dao.ArticleDao;
import com.noname.HWBlog.dao.CommentDao;
import com.noname.HWBlog.model.Article;
import com.noname.HWBlog.model.Comment;
import com.noname.HWBlog.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentService {
    @Resource
    ArticleDao articleDao;
    @Resource
    CommentDao commentDao;

    public List<Comment> getCommentByArticleId(Integer articleId)
    {
        return commentDao.getCommentByArticleId(articleId);
    }

    public List<Comment> getCommentByUserId(Integer userId)
    {
        return commentDao.getCommentByUserId(userId);
    }

    public void addComment(User user, String text, Article article)
    {
        Comment comment = new Comment();
        comment.setArticleId(article.getId());
        comment.setUserId(user.getId());
        comment.setText(text);
        commentDao.insert(comment);
    }


}
