package onetoone;

import jakarta.persistence.*;


public class Employee {
    @Id
    @Column(name = "emp_id")
    private int empid;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    private EmployeeDetail empdetails;

    public Employee(int empid, String name, EmployeeDetail empdetails) {
        this.empid = empid;
        this.name = name;
        this.empdetails = empdetails;
    }

    public Employee() {
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

    public EmployeeDetail getEmpdetails() {
        return empdetails;
    }

    public void setEmpdetails(EmployeeDetail empdetails) {
        this.empdetails = empdetails;
    }
}
