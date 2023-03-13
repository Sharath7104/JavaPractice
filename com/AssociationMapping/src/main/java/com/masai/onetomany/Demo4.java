package com.masai.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Demo4 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sessionMgr");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        User u = new User();
        u.setUserId(1);
        u.setUserName("Shubhendu");

        Phone p1 = new Phone();
        p1.setUserId(1);
        p1.setPhoneType("Mobile-iphone");
        p1.setPhoneNo("1234");


        Phone p2 = new Phone();
        p2.setUserId(1);
        p2.setPhoneType("Mobile-samsung");
        p2.setPhoneNo("4567");

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(p1);
        phoneList.add(p2);

        u.setPhoneList(phoneList);

        User u2 = new User();
        u2.setUserId(2);
        u2.setUserName("Prince");

        Phone p3 = new Phone();
        p3.setUserId(2);
        p3.setPhoneType("Mobile-nokia");
        p3.setPhoneNo("7658");

        List<Phone> phoneList2 = new ArrayList<>();
        phoneList2.add(p3);

        u2.setPhoneList(phoneList2);

        em.persist(u);
        em.persist(u2);

        em.getTransaction().commit();

        em.close();
    }
}
