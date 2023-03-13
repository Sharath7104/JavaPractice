package onetoonebi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OnetoOneBiDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("user");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        User user = new User();
        user.setUsername("Sharath");
        Passport passport = new Passport();
        passport.setPnumber("123456");

        passport.setUser(user);
        user.setPassport(passport);

        em.persist(user);

        em.getTransaction().commit();
        em.close();


    }

}
