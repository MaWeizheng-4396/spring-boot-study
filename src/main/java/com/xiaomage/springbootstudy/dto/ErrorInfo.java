package com.xiaomage.springbootstudy.dto;

import java.util.Date;

/**
 * @author xiaomage
 * @date 2019/5/4 - 0:40
 */
public class ErrorInfo<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;
    private String message;
    private String url;
    private Date date;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static Integer getOK() {
        return OK;
    }

    public static Integer getERROR() {
        return ERROR;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getData() {
        return date;
    }

    public void setData(Date data) {
        this.date = data;
    }

}
