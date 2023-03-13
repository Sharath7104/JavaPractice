package com.masai.manytoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Demo5 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Department department = new Department();
        department.setDname("CSE");

        Employee employee1 = new Employee();
        employee1.setEname("Shubhendu");
        employee1.setDepartment(department);


        Employee employee2 = new Employee();
        employee2.setEname("Vishal");
        employee2.setDepartment(department);

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);


        department.setEmployeeSet(employeeSet);
        em.persist(department);
        em.getTransaction().commit();

        em.close();
    }
}
