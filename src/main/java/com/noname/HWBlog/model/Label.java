package com.noname.HWBlog.model;

import java.io.Serializable;
import lombok.Data;

/**
 * label
 * @author 
 */
@Data
public class Label implements Serializable {
    private Integer id;

    private String text;

    private static final long serialVersionUID = 1L;
}