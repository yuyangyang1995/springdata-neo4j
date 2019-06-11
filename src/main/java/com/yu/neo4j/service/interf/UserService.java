package com.yu.neo4j.service.interf;

import com.yu.neo4j.dao.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User findByUserNo(String userNo);
    List<User> findByDepartment(String department);
    User findUserByDepartmentaAndUserNo(String department,String userNo);
    List<User> findUsersByDepartmentaAndUserNo(String department,String userNo);
    User findbyUserNameAndUserNo(String userName,String userNo);
    User  save(User user);
    void  updateUsernameByUserNo(User user);
    void  deleteByUserNo (String userNo);
    void createUserFriend(String userName,String userNames);
    void createUserRelation(String userName,String userNames,String relation,String name,String num);
    void createUserDepartRelation(String userName,String departmentName,
                                 String name,String num,String price);
}
