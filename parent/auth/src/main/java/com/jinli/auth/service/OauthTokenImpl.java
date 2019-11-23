package com.jinli.auth.service;


import com.jinli.common.domain.request.LoginRequest;
import com.jinli.common.domain.response.Commoncode;
import com.jinli.common.domain.response.LoginResult;

public class OauthTokenImpl implements OauthToken{

    @Override
    public LoginResult login(LoginRequest loginRequest) {
        if(loginRequest.getUsername().equals("lyz") && loginRequest.getPassword().equals("123")){
            return new LoginResult(Commoncode.SUCCESS,"");
        }
        return new LoginResult(Commoncode.FAIL,"");
    }

    @Override
    public void Logout() {

    }
}
