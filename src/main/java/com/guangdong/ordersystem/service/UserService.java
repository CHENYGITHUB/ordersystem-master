package com.guangdong.ordersystem.service;

import com.guangdong.ordersystem.mapper.UserMapper;
import com.guangdong.ordersystem.pojo.User;
import com.guangdong.ordersystem.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectByUsername(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample).get(0);
    }
}
