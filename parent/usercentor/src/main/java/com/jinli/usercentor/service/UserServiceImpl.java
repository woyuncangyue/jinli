package com.jinli.usercentor.service;


import com.jinli.common.domain.ucenter.XcCompanyUser;
import com.jinli.common.domain.ucenter.XcUser;
import com.jinli.usercentor.dao.XcCompanyUserRespository;
import com.jinli.usercentor.dao.XcUserRespository;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
@org.springframework.stereotype.Service
@Service(interfaceClass = XcUserService.class)
public class UserServiceImpl implements XcUserService{
    @Autowired
    XcCompanyUserRespository xcCompanyUserRespository;
    @Autowired
    XcUserRespository xcUserRespository;

    public XcCompanyUser getCompanyUserById(String id){
        Optional<XcCompanyUser> byId = xcCompanyUserRespository.findById(id);
        if(byId.isPresent()){
            XcCompanyUser xcCompanyUser = byId.get();
            return xcCompanyUser;
        }
        return null;
    }

    public XcUser getUserByName(String name){
        Optional<XcUser> byName = xcUserRespository.findByUsername(name);
        if(byName.isPresent()){
            XcUser xcUser = byName.get();
            return xcUser;
        }
        return null;
    }

}
