package com.yu.neo4j.dao;

import javafx.scene.control.Label;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label = "department")
public class Department {
    @Id
    @GeneratedValue
    private  long  id;
    private  String departmentNo;
    private  String departmentName;
    private  String departmentLender;
    private  String departmentNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentLender() {
        return departmentLender;
    }

    public void setDepartmentLender(String departmentLender) {
        this.departmentLender = departmentLender;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
}
