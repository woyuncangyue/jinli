package com.jinli.auth.service;


import com.jinli.auth.model.UserJwt;
import com.jinli.common.domain.ucenter.XcUser;
import com.jinli.usercentor.service.XcUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {
    @Reference
    private XcUserService xcUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        XcUser userByName = xcUserService.getUserByName(username);
        System.out.println(userByName);
        if (userByName!=null) {
            UserJwt user = new UserJwt(username, userByName.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(""));
            user.setId(userByName.getId());
            user.setName(userByName.getName());
            return user;
        }
        return null;
    }
}
