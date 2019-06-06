package com.yu.neo4j.controller;

import com.yu.neo4j.dao.User;
import com.yu.neo4j.service.interf.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping(value = "save",method = RequestMethod.GET)
    @ApiOperation(value = "保存用户信息",notes = "保存用户信息")
    public User save (User user){
        return userService.save(user);
    }

    @RequestMapping(value = "findByNo",method = RequestMethod.GET)
    @ApiOperation(value = "根据编号查询用户",notes = "根据编号查询用户")
    public User findByNo(String userNo){
        return  userService.findByUserNo(userNo);
    }
}
