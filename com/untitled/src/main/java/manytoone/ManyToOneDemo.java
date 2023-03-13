package manytoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManyToOneDemo {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("user");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();



        Address a1 = new Address();
        a1.setAid(1);
        a1.setCity("Bangalore");
        a1.setPincode("560016");

        Student s1 = new Student();
        s1.setName("Sharath");
        s1.setAddress(a1);

        Student s2 = new Student();
        s2.setName("Saahil");
        s2.setAddress(a1);

        Student s3 = new Student();
        s3.setName("Rahul");
        s3.setAddress(a1);



        em.persist(s1);
        em.persist(s2);em.persist(s3);

        em.getTransaction().commit();
        em.close();

        System.out.println("Done");

    }
}
