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
}
