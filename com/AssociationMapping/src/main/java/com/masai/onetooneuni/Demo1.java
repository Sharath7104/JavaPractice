package com.masai.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Employee employee = new Employee();
        employee.setName("Shubhendu");
        employee.setEmpid(1);

        EmployeeDetail employeeDetail = new EmployeeDetail();
        employeeDetail.setAge(26);
        employeeDetail.setState("karnataka");
        employeeDetail.setEmpid(1);

        employee.setEmployeeDetail(employeeDetail);

        em.persist(employee);

        //find
        Employee e = em.find(Employee.class, 1);
        System.out.println(e.getName());
        System.out.println(e.getEmployeeDetail().getState());


        em.getTransaction().commit();
        em.close();
    }
}
