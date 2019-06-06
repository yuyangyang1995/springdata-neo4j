package com.yu.neo4j.service.Impl;

import com.yu.neo4j.dao.User;
import com.yu.neo4j.repos.UserRepos;
import com.yu.neo4j.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepos userRepos;
    @Override
    public User findByUserNo(String userNo) {
        return userRepos.findByUserNo(userNo);
    }

    @Override
    public User save(User user) {
      return   userRepos.save(user);
    }
}
