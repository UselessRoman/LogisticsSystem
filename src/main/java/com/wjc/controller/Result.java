package com.wjc.controller;

public class Result
{
    private int code;
    private Object object;
    private String msg;

    public Result(int code, Object object, String msg) {
        this.code = code;
        this.object = object;
        this.msg = msg;
    }

    public Result(int code, Object object) {
        this.code = code;
        this.object = object;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
