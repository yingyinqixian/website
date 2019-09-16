package com.yingyinqi.website.exception;

public class CustomException extends RuntimeException{
    private String msg;
    private Integer code;

    public CustomException(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public CustomException(String message, String msg, Integer code) {
        super(message);
        this.msg = msg;
        this.code = code;
    }

    public CustomException(String message, Throwable cause, String msg, Integer code) {
        super(message, cause);
        this.msg = msg;
        this.code = code;
    }

    public CustomException(Throwable cause, String msg, Integer code) {
        super(cause);
        this.msg = msg;
        this.code = code;
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String msg, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}