package com.masai.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Passport p = new Passport();
        p.setPnumber("123456");

        User u = new User();
        u.setUsername("Shubhendu");

        p.setUser(u);
        u.setPassport(p);

        em.persist(u);

        em.getTransaction().commit();
        em.close();
    }

}
