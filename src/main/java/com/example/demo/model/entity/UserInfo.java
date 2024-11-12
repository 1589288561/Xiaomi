package com.example.demo.model.entity;

import lombok.Data;
/**
 * (UserInfo)实体类
 *
 * @author pzr
 * @since 2024-11-12 13:57:46
 */

@Data
public class UserInfo  {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 头像
     */
    private String avater;
    /**
     * 昵称
     */
    private String name;
    /**
     * 0=男，1=女
     */
    private Integer gender;
    /**
     * 年龄
     */
    private Integer age;

}

