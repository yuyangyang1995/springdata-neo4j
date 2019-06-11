package com.yu.neo4j.repos;

import com.yu.neo4j.dao.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepos extends Neo4jRepository<User,Long> {
    /*
    根据user的no来查询user
     */
    User findByUserNo(@Param("userNo") String userNo);
    /*
    根据user的部门来查询
     */
    List<User> findUsersByDepartment(@Param("department") String department);
    /*
    根据user的部门和用户编号来查询(单个节点)
    */
    User findUserByDepartmentAndUserNo(@Param("department") String department,@Param("userNo") String userNo);
    /*
    根据user的部门和用户编号来查询(多个节点)
    */
    List<User> findUsersByDepartmentAndUserNo(@Param("department") String department,@Param("userNo") String userNo);
    /**
     * 根据用户名和用户编号来查询用户：方式一：封装方法
     */
    User findUserByUserNameAndUserNo(@Param("userName")String userName,@Param("userNo")String userNo);
    /**
     * 根据用户名和用户编号来查询用户：方式二：通过注解来写
     */
    @Query("MATCH (u:User) where u.userName={userName} and u.userNo={userNo} return u")
    User findbyUserNameAndUserNo(@Param("userName")String userName,@Param("userNo")String userNo);
    /**
     * 根据用户编号来修改用户的名字 通过注解的方式来构建写Cypher语句
     */
    @Query("Match (u:User) where u.userNo={userNo} set u.userName={userName},u.position={position}" +
            ",u.userPassword={userPassword},u.salary={salary},u.department={department}")
    void  updateUsernameByUserNo(@Param("userNo") String userNo,@Param("userName") String userName,
                                 @Param("position") String position,@Param("userPassword")String userPassword,
                                 @Param("salary") Double salary,@Param("department") String department);
    /**
     * 根据用户的编码删除某个节点:封装方法
     */
    Long deleteByUserNo(@Param("userNo") String userNo);
    /**
     * 根据用户的编码删除某个节点:注解方法
     */
    @Query("match (u:User) where u.userNo={userNo} delete u")
    void deleteUserNo(@Param("userNo")String userNo);
}
