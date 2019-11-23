package com.jinli.common.domain.response;

import lombok.Data;

@Data
public class ResponseResult {
    int code;
    String message;
    boolean success;

    public ResponseResult(Commoncode commoncode){
        this.code = commoncode.code;
        this.message = commoncode.message;
        this.success = commoncode.success;
    }

}
