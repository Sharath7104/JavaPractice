package com.masai.manytoonebi;

import javax.persistence.*;

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;
    private String ename;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    public Employee() {
    }

    public Employee(int empid, String ename, Department department) {
        this.empid = empid;
        this.ename = ename;
        this.department = department;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
