package com.masai.onetooneuni;

import javax.persistence.*;

public class Employee {

    @Id
    @Column(name = "emp_id")
    private int empid;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="emp_id")
    private EmployeeDetail employeeDetail;

    public Employee() {
    }

    public Employee(int empid, String name, EmployeeDetail employeeDetail) {
        this.empid = empid;
        this.name = name;
        this.employeeDetail = employeeDetail;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDetail getEmployeeDetail() {
        return employeeDetail;
    }

    public void setEmployeeDetail(EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
    }
}
