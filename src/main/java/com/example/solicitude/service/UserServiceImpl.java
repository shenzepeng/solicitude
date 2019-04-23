package com.example.solicitude.service;

import com.example.solicitude.mapper.UserMapper;
import com.example.solicitude.pojo.User;
import com.example.solicitude.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 19:59
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUserById(long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findUserById(long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public List<User> findUserByNickName(String nickName) {
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andNickNameEqualTo(nickName);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public List<User> findUserByUsernameAndPassword(String username, String password) {
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
