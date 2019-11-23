package com.jinli.usercentor.dao;

import com.jinli.common.domain.ucenter.XcCompanyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface XcCompanyUserRespository extends JpaRepository<XcCompanyUser,String> {
    Optional<XcCompanyUser> findById(String id);
}
