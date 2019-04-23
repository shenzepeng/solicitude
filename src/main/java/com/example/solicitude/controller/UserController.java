package com.example.solicitude.controller;

import com.example.solicitude.pojo.User;
import com.example.solicitude.service.UserService;
import com.example.solicitude.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.SimpleTimeZone;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-27 00:03
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("添加user")
    @PostMapping("/insertUser.action")
    public SzpJsonResult insertUser(@RequestBody User user){
        userService.insertUser(user);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id删除user")
    @DeleteMapping("/deleteUserById.action")
    public SzpJsonResult deleteUserById(@RequestBody long id){
        userService.deleteUserById(id);
        return SzpJsonResult.ok();
    }
    @ApiOperation("根据主键跟新，值不为null的字段")
    @PutMapping("/updateUserById.action")
    public SzpJsonResult updateUserById(@RequestBody User user){
        userService.updateUserById(user);
        return SzpJsonResult.ok();
    }
    //通过主键id找到user
    @ApiOperation("通过主键id找到user")
    @GetMapping("/findUserById.action")
    public SzpJsonResult findUserById(long id){

        User userById = userService.findUserById(id);
        return SzpJsonResult.ok(userById);
    }
    //通过昵称找到user
    @ApiOperation("通过昵称找到user")
    @GetMapping("/findUserByNickName.action")
    public SzpJsonResult findUserByNickName(String nickName){
        List<User> userByNickName = userService.findUserByNickName(nickName);
        return SzpJsonResult.ok(userByNickName);
    }
    //通过username找到user
    @ApiOperation("通过username找到user")
    @GetMapping("/findUserByUsername.action")
    public SzpJsonResult findUserByUsername(String username){
        List<User> userByUsername = userService.findUserByUsername(username);
        return SzpJsonResult.ok(userByUsername);
    }
    //登录
    @ApiOperation("登录")
    @GetMapping("/findUserByUsernameAndPassword.action")
    public SzpJsonResult findUserByUsernameAndPassword(String username,
                                                       String password){
        List<User> userByUsernameAndPassword = userService.findUserByUsernameAndPassword(username, password);
        if (userByUsernameAndPassword.size()!=0&&userByUsernameAndPassword!=null) {
            return SzpJsonResult.ok(userByUsernameAndPassword);
        }else {
            return SzpJsonResult.errorMsg("请重新检查密码");
        }
    }
}
