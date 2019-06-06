package com.yu.neo4j.repos;

import com.yu.neo4j.dao.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepos extends Neo4jRepository<User,Long> {
    /*
    根据user的no来查询user
     */
    User findByUserNo(@Param("userNo") String userNo);
}
