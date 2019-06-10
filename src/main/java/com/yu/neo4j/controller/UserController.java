package com.yu.neo4j.controller;

import com.yu.neo4j.dao.User;
import com.yu.neo4j.service.interf.UserService;
import io.swagger.annotations.ApiOperation;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value = "findByDepartment",method = RequestMethod.GET)
    @ApiOperation(value = "根据部门来查询用户",notes = "根据部门来查询用户")
    public List<User> findByDepartment(String department){
        return userService.findByDepartment(department);
    }

    @RequestMapping(value = "findUserByDepartmentaAndUserNo",method = RequestMethod.GET)
    @ApiOperation(value = "根据部门以及用户编号来查询用户",notes = "根据部门以及用户编号来查询用户")
    public User findUserByDepartmentaAndUserNo(String department,String userNo){
        return userService.findUserByDepartmentaAndUserNo(department,userNo);
    }
    @RequestMapping(value = "findUsersByDepartmentaAndUserNo",method = RequestMethod.GET)
    @ApiOperation(value = "根据部门以及用户编号来查询用户(多个节点)",notes = "根据部门以及用户编号来查询用户")
    public List<User> findUsersByDepartmentaAndUserNo(String department,String userNo){
        return userService.findUsersByDepartmentaAndUserNo(department,userNo);
    }
    @RequestMapping(value = "findbyUserNameAndUserNo",method = RequestMethod.GET)
    @ApiOperation(value = "根据用户名和用户编码来获取用户",notes = "根据用户名和用户编码来查询用户")
    public  User findbyUserNameAndUserNo(String userName,String userNo){
        return  userService.findbyUserNameAndUserNo(userName,userNo);
    }
}
