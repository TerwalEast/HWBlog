package com.noname.HWBlog.model;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String introduce;

    private String email;

    private String phone;

    private String backUrl;

    private String avatarUrl;

    private Byte type;

    private static final long serialVersionUID = 1L;
}