package com.santoadji21.springnestacademy.dto;

import lombok.Data;

@Data
public class ResponseGlobal {
    private int code;
    private String status;
    private Object data;
}
