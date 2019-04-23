package com.example.solicitude.service;

import com.example.solicitude.pojo.User;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 19:49
 * @Description: SualLabel, Write down some description!!!
 */
public interface UserService {
    void insertUser(User user);
    void deleteUserById(long id);
    void updateUserById(User user);
    //通过主键id找到user
    User findUserById(long id);
    //通过昵称找到user
    List<User> findUserByNickName(String nickName);
    //通过username找到user
    List<User> findUserByUsername(String username);
    //登录
    List<User> findUserByUsernameAndPassword(String username,String password);
}
