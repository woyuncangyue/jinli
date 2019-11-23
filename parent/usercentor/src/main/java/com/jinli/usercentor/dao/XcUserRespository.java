package com.jinli.usercentor.dao;


import com.jinli.common.domain.ucenter.XcUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface XcUserRespository extends JpaRepository<XcUser,String> {
    Optional<XcUser> findByUsername(String username);
}
