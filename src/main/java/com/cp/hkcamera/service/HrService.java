package com.cp.hkcamera.service;

import com.cp.hkcamera.mapper.HrMapper;
import com.cp.hkcamera.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author feipeng
 * @site www.gcp168.cn
 * @create 2020-03-21 11:17
 */
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserBysername(username);
        if(hr == null){
            throw new UsernameNotFoundException("用户名不存在！");
        }
        return hr;
    }
}
