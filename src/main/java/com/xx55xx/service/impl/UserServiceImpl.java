package com.xx55xx.service.impl;


import com.xx55xx.entity.User;
import com.xx55xx.mapper.UserMapper;
import com.xx55xx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Boolean addUser(User record) {
        Boolean result = false;
        try {
            userMapper.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public Integer updateUser(User record) {

        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public Integer deleteUser(Integer userId) {

        return userMapper.deleteByPrimaryKey(userId);

    }
}
