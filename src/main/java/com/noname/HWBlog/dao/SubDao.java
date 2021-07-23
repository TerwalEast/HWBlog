package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.Sub;

public interface SubDao {

    int insert(Sub record);

    int insertSelective(Sub record);

    void disable(Integer userId, Integer articleId);

    void enable(Integer userId, Integer articleId);

    Sub getSub(Integer userId, Integer articleId);

}