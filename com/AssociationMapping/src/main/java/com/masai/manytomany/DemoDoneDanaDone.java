package com.masai.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class DemoDoneDanaDone {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Course c1 = new Course();
        c1.setCname("JAVA");
        Course c2 = new Course();
        c2.setCname("PYTHON");
        Course c3 = new Course();
        c3.setCname("CPP");

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(c1);
        courseSet.add(c2);
        courseSet.add(c3);


        Student s1 = new Student();
        s1.setSname("Kshitija");
        Student s2 = new Student();
        s2.setSname("Khushi");

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);



        //Associate
        c1.setStudentSet(students);
        c2.setStudentSet(students);
        c3.setStudentSet(students);

        s1.setCourseSet(courseSet);
        s2.setCourseSet(courseSet);

        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();

        em.close();
    }



}
