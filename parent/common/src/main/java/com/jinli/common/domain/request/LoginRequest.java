package com.jinli.common.domain.request;

import lombok.Data;

@Data
public class LoginRequest {
    String username;
    String password;
    String verifycode;
}
