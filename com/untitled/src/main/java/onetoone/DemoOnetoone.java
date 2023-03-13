package onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DemoOnetoone {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Employee employee = new Employee();
        employee.setName("Sharath");
        employee.setEmpid(1);

        EmployeeDetail empdetails = new EmployeeDetail();
        empdetails.setAge(25);
        empdetails.setState("Karnataka");
        empdetails.setEmpid(1);

        employee.setEmpdetails(empdetails);

        em.persist(employee);

                Employee e1 = em.find(Employee.class,1);
        System.out.println(e1.getName());
        em.getTransaction().commit();

        em.close();
    }
}
