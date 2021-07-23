package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.Comment;

import java.util.List;

public interface CommentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<Comment> getCommentByArticleId(Integer articleId);

    List<Comment> getCommentByUserId(Integer userId);
}