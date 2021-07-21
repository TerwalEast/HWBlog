package com.noname.HWBlog.service;


import com.noname.HWBlog.dao.UserDao;
import com.noname.HWBlog.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    UserDao userDao;

    public boolean login(Integer userId, String password)
    {
        User user = userDao.selectByPrimaryKey(userId);
        if(user != null && user.getPassword().equals(password))
        {
            return true;
        }
        return false;
    }


}
