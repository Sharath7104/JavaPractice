package com.masai.manytoonebi;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptid;
    private String dname;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Employee> employeeSet;

    public Department() {
    }

    public Department(int deptid, String dname, Set<Employee> employeeSet) {
        this.deptid = deptid;
        this.dname = dname;
        this.employeeSet = employeeSet;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
