package com.masai.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Address address = new Address();
        address.setCity("blr");
        address.setPincode("1234");
        address.setAid(1);

        Student s = new Student();
        s.setName("Shubhendu");
        s.setAddress(address);

        Student s2 = new Student();
        s2.setName("Arshad");
        s2.setAddress(address);

        Student s3 = new Student();
        s3.setName("prince");
        s3.setAddress(address);

        em.persist(s);
        em.persist(s2);
        em.persist(s3);

        em.getTransaction().commit();
        em.close();
    }
}
