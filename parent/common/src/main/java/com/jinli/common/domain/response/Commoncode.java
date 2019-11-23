package com.jinli.common.domain.response;


public enum Commoncode {
    SUCCESS(true,10000,"操作成功!"),
    FAIL(false,11111,"操作失败!");
    String message;
    boolean success;
    int code;

    private Commoncode(boolean success, int code, String message){
        this.code = code;
        this.message = message;
        this.success = success;
    }

}
