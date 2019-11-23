package com.jinli.usercentor.service;

import com.jinli.common.domain.ucenter.XcCompanyUser;
import com.jinli.common.domain.ucenter.XcUser;

public interface XcUserService {
    XcCompanyUser getCompanyUserById(String id);

    XcUser getUserByName(String name);
}
