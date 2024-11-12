package com.example.demo.model.vo;


import lombok.Data;

@Data
public class ResponseVo<T> {
    private T data;
    private int code;
    private String msg;
}
