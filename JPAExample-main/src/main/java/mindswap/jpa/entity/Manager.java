package mindswap.jpa.entity;

import mindswap.jpa.entity.Resources.ParkingSpace;
import mindswap.jpa.entity.Resources.TeacherEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {
    public static void main(String[] args) {
        System.out.println("coisas");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("school_parking");
        EntityManager em = emf.createEntityManager();

        //Insert Teacher
        System.out.println("Insert new Teacher");
        em.getTransaction().begin();
        ParkingSpace p1 = new ParkingSpace("A", 1);
        ParkingSpace p2 = new ParkingSpace("A", 2);
        ParkingSpace p3 = new ParkingSpace("A", 3);

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        //em.getTransaction().commit();

        TeacherEntity t1 = new TeacherEntity("Filipa", 25,"Car", p1);
        TeacherEntity t2 = new TeacherEntity("Nuno", 43, "Motorcycle", p2);
        TeacherEntity t3 = new TeacherEntity("Milton", 31, "Car", p3);

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        em.getTransaction().commit();
        //System.out.println("cenas");
        t1.print();
        t2.print();
        t3.print();

        emf.close();
        em.close();
    }
}
