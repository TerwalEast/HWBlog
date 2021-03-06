package com.noname.HWBlog.dao;

import com.noname.HWBlog.model.User;

import java.util.List;


public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAllUser();

    List<Integer> getUserIDsThatNameContainString(String query);



}