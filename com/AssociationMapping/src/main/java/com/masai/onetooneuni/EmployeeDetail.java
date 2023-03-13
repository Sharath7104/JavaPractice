package com.masai.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EmployeeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailId;

    private int age;

    private String state;

    private int empid;

    public EmployeeDetail() {
    }

    public EmployeeDetail(int detailId, int age, String state, int empid) {
        this.detailId = detailId;
        this.age = age;
        this.state = state;
        this.empid = empid;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}
