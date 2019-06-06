package com.yu.neo4j.service.interf;

import com.yu.neo4j.dao.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findByUserNo(String userNo);
    User  save(User user);
}
