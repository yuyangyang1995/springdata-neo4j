package com.yu.neo4j.dao;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.io.Serializable;

/**
 * 使用 neo4j 数据库实体类需要添加一些必要的注解
 * @NodeEntity:标签名  相当于mysql中的表名 这个标签名必须要和数据库中标签名匹配，实体类的名字可以不一致但是建议写成一致
 * @Id
 * @GeneratedValue  这两个注解必须要声明在id上，而且这个id的类型必须是long而且必须要有
 * 非必要的注解
 * @Transient的作用是指定该属性或字段不是永久的。 它用于注释实体类，映射超类或可嵌入类的属性或字段
 * 具体的使用是如果该属性没有get方法就放在属性上修饰
 * 如果有get方法就放在get方法上
 */
@NodeEntity(label = "User")
public class User  implements Serializable {
    @Id
    @GeneratedValue
    private  Long id;
    private  String userNo;
    private  String userName;
    private  String userPassword;
    private  String department;
    private  Double salary;
    private  String position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
