package com.noname.HWBlog.service;

import com.noname.HWBlog.dao.ArticleLabelDao;
import com.noname.HWBlog.dao.LabelDao;
import com.noname.HWBlog.model.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LabelService {
    @Resource
    LabelDao labelDao;
    @Resource
    ArticleLabelDao articleLabelDao;






}
