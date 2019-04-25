package com.xx55xx.service;


import com.xx55xx.entity.User;

public interface UserService {
    User getUserById(Integer userId);
    Boolean addUser(User record);
    Integer deleteUser(Integer userId);
    Integer updateUser(User record);
}
