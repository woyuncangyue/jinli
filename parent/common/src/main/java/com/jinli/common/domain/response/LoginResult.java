package com.jinli.common.domain.response;

import lombok.Data;

@Data
public class LoginResult extends ResponseResult{
    private String token;

    public LoginResult(Commoncode commoncode,String token){
        super(commoncode);
        this.token = token;
    }
}
