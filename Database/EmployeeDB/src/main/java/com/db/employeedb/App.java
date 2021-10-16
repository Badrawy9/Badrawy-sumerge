package com.db.employeedb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("persistence");
        EntityManager em= emf.createEntityManager();

       List<Employee> employees= em.createQuery("Select a from Employee a",Employee.class)
                .getResultList();

        Roles r1 = new Roles();
        r1.setName("Accountant");
        em.getTransaction().begin();
        em.persist(r1);
//        em.getTransaction().commit();

        Roles r2 = new Roles();
        r1.setName("Sales");
//        em.getTransaction().begin();
        em.persist(r2);

        Roles r3 = new Roles();
        r1.setName("SE");
//        em.getTransaction().begin();
        em.persist(r3);

        Proj p1=new Proj();
        p1.setName("kahraba");
        p1.setDate(2019);
        p1.setManager("yassin");
        em.persist(p1);

        Proj p2=new Proj();
        p2.setName("api");
        p2.setDate(2020);
        p2.setManager("sherif");
        em.persist(p2);

        Proj p3=new Proj();
        p3.setName("Front");
        p3.setDate(2021);
        p3.setManager("noha");
        em.persist(p3);



        Employee e1 = new Employee();
        e1.setName("Mohamed");
        e1.setAge(24);
        e1.setEmail("mohamed@gmail.com");
        e1.setMobile(011000);
        e1.setNatId(218763L);
        e1.setRole(r1);
//        e1.setProjects(p1);

//        em.clear();
//        em.getTransaction().begin();
        em.persist(e1);
//        em.getTransaction().commit();
//        em.close();

        Employee e2 = new Employee();
        e2.setName("Ahmed");
        e2.setAge(20);
        e2.setEmail("Ahmed@gmail.com");
        e2.setMobile(01230);
        e2.setNatId(142563L);
        e2.setRole(r2);
//        e1.setProjects(p2);
//        em.clear();
//        em.getTransaction().begin();
        em.persist(e2);
//        em.getTransaction().commit();
//        em.close();

        Employee e3 = new Employee();
        e3.setName("Yasser");
        e3.setAge(35);
        e3.setEmail("Yasser@gmail.com");
        e3.setMobile(010207);
        e3.setNatId(927134L);
        e3.setRole(r3);
//        e1.setProjects(p3);
//        em.clear();
//        em.getTransaction().begin();
        em.persist(e3);
        em.getTransaction().commit();
        em.close();


    }


}
