package com.noname.HWBlog.service;

import com.noname.HWBlog.dao.ArticleLabelDao;
import com.noname.HWBlog.dao.LabelDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LabelService {
    @Resource
    LabelDao labelDao;
    @Resource
    ArticleLabelDao articleLabelDao;





}
