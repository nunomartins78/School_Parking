package mindswap.jpa.entity;

import mindswap.jpa.entity.Resources.ParkingSpace;
import mindswap.jpa.entity.Resources.TeacherEntity;
import mindswap.jpa.entity.Resources.VehicleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {
    public static void main(String[] args) {
        //System.out.println("coisas");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("school_parking");
        EntityManager em = emf.createEntityManager();

        //Insert Parking Spaces
        System.out.println("Insert Parking Spot");
        em.getTransaction().begin();

        ParkingSpace p1 = new ParkingSpace("A", 1);
        ParkingSpace p2 = new ParkingSpace("A", 2);
        ParkingSpace p3 = new ParkingSpace("A", 3);

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        //Insert Teachers
        System.out.println("Insert new teacher data");
        em.getTransaction().begin();

        TeacherEntity t1 = new TeacherEntity("Filipa", 25,"Car", p1);
        TeacherEntity t2 = new TeacherEntity("Nuno", 43, "Motorcycle", p2);
        TeacherEntity t3 = new TeacherEntity("Milton", 31, "Car", p3);

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        em.getTransaction().commit();

        //Insert Vehicles
        System.out.println("Insert new vehicle");
        em.getTransaction().begin();

        VehicleEntity e1 = new VehicleEntity("12-AB-34", "Car");
        VehicleEntity e2 = new VehicleEntity("56-CD-78", "Motorcycle");
        VehicleEntity e3 = new VehicleEntity("90-EF-12", "Car");

        em.persist(e1);
        em.persist(e2);
        em.persist(e3);

        em.getTransaction().commit();
        //System.out.println("cenas");
        t1.print();
        t2.print();
        t3.print();

        emf.close();
        em.close();
    }
}
