package com.example.hk.utils;

import lombok.Data;

@Data
public class JSONResponse<T> {
    private boolean success;
    private String message;
    private T data;
    private Integer code;
}
