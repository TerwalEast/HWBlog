package com.noname.HWBlog.controller;

import com.noname.HWBlog.model.User;
import com.noname.HWBlog.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Resource
    LoginService loginService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, User user, Model model) {
        if (loginService.login(user.getId(), user.getPassword()))
        {
            return "";
        }
        else
            {
            model.addAttribute("error", "用户名或密码错误");
            return "";
        }
    }

    @RequestMapping(value = "")
    public String updateProfile()








}
