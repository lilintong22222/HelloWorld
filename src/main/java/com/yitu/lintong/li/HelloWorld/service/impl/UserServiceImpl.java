package com.yitu.lintong.li.HelloWorld.service.impl;

import com.yitu.lintong.li.HelloWorld.dao.UserMapper;
import com.yitu.lintong.li.HelloWorld.model.User;
import com.yitu.lintong.li.HelloWorld.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
