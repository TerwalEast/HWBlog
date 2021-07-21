package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.Label;

public interface LabelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Label record);

    int insertSelective(Label record);

    Label selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);

    //自定义开始

    int getIdByName(String name);

}