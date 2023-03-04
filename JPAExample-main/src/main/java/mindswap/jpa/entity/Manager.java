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
        ParkingSpace p4 = new ParkingSpace("B", 1);
        ParkingSpace p5 = new ParkingSpace("B", 2);
        ParkingSpace p6 = new ParkingSpace("B", 3);

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(p6);
        em.getTransaction().commit();


        //Insert Vehicles
        System.out.println("Insert new vehicle");
        em.getTransaction().begin();

        VehicleEntity e1 = new VehicleEntity("12-AB-34", "Car");
        VehicleEntity e2 = new VehicleEntity("56-CD-78", "Motorcycle");
        VehicleEntity e3 = new VehicleEntity("90-EF-12", "Car");
        VehicleEntity e4 = new VehicleEntity("34-GH-56", "Motorcycle");
        VehicleEntity e5 = new VehicleEntity("78-IJ-90", "Motorcycle");
        VehicleEntity e6 = new VehicleEntity("12-KL-34", "Car");

        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.getTransaction().commit();


        //Insert Teachers
        System.out.println("Insert new teacher data");
        em.getTransaction().begin();

        TeacherEntity t1 = new TeacherEntity("Filipa", 25,e1, p1);
        TeacherEntity t2 = new TeacherEntity("Nuno", 43, e2, p2);
        TeacherEntity t3 = new TeacherEntity("Milton", 31, e3, p3);
        TeacherEntity t4 = new TeacherEntity("Miguel", 33, e4, p4);
        TeacherEntity t5 = new TeacherEntity("Augusto", 35, e5, p5);
        TeacherEntity t6 = new TeacherEntity("Filipe", 30, e6, p6);

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);
        em.persist(t4);
        em.persist(t5);
        em.persist(t6);
        em.getTransaction().commit();

        //System.out.println("cenas");
        t1.print();
        t2.print();
        t3.print();
        t4.print();
        t5.print();
        t6.print();

        emf.close();
        em.close();
    }
}
