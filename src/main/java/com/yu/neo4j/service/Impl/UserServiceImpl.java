package com.yu.neo4j.service.Impl;

import com.yu.neo4j.dao.User;
import com.yu.neo4j.repos.UserRepos;
import com.yu.neo4j.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepos userRepos;
    @Override
    public User findByUserNo(String userNo) {
        return userRepos.findByUserNo(userNo);
    }

    @Override
    public List<User> findByDepartment(String department) {
        return userRepos.findUsersByDepartment(department);
    }

    @Override
    public User findUserByDepartmentaAndUserNo(String department, String userNo) {
        return userRepos.findUserByDepartmentAndUserNo(department,userNo);
    }

    @Override
    public List<User> findUsersByDepartmentaAndUserNo(String department, String userNo) {
        return userRepos.findUsersByDepartmentAndUserNo(department,userNo);
    }

    @Override
    public User findbyUserNameAndUserNo(String userName, String userNo) {
        User user = new User();
        //如果用户编码是213时使用封装的方式来获取用户信息，否则就按照注解的方式来获取
        if (userNo.equals("213")){
            user = userRepos.findUserByUserNameAndUserNo(userName,userNo);
        }else {
            user = userRepos.findbyUserNameAndUserNo(userName,userNo);
        }
        return  user;
    }

    @Override
    public User save(User user) {
      return   userRepos.save(user);
    }

    @Override
    public void updateUsernameByUserNo(User user) {
        userRepos.updateUsernameByUserNo(user.getUserNo(),user.getUserName(),user.getPosition(),
                user.getUserPassword(),user.getSalary(),user.getDepartment());
    }

    @Override
    public void deleteByUserNo(String userNo) {
        if (userNo.equals("214")){
            userRepos.deleteUserNo(userNo);
            System.out.println("编码是214");
        }else {
            userRepos.deleteByUserNo(userNo);
        }

    }

    @Override
    public void createUserFriend(String userName, String userNames) {
        userRepos.createUserFriend(userName,userNames);
    }

    @Override
    public void createUserRelation(String userName, String userNames, String relation,String name,String num) {
        userRepos.createUserRelation(userName, userNames, relation,name,num);
    }

    @Override
    public void createUserDepartRelation(String userName, String departmentName, String name, String num, String price) {
        userRepos.createUserDepartRelation(userName, departmentName, name, num, price);
    }

    @Override
    public List<User> findUserLikeUsername(String userName) {
        //注解的方式暂时测试不出来
        if (userName.equals("ze")){
            return  userRepos.findUsersByUserNameIsLike(".*"+userName+".*");
        }else {
            return userRepos.findUserLikeUsername(".*"+userName+".*");
        }
    }

    @Override
    public void craeteRelationByIdAndName(Long id, String departmentName, String name, String time) {
        userRepos.craeteRelationByIdAndName(id, departmentName, name, time);
    }

    @Override
    public User getUserByUserNameAndRelation(String userName, String name) {
        userName = ".*"+userName+".*";
        return userRepos.getUserByUserNameAndRelation(userName, name);
    }
}
