package com.jinli.auth.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jinli.common.domain.request.LoginRequest;
import com.jinli.common.domain.response.LoginResult;

@Service
public interface OauthToken {
    public LoginResult login(LoginRequest loginRequest);

    public void Logout();
}
