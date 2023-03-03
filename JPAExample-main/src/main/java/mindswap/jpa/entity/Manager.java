package mindswap.jpa.entity;



import mindswap.jpa.entity.Resources.TeacherEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Manager {
    public static void main(String[] args) {
        System.out.println("coisas");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("school_parking");
        EntityManager em = emf.createEntityManager();

        System.out.println("cenas");
        //Insert Teacher
        System.out.println("Insert new Teacher");
        em.getTransaction().begin();
        TeacherEntity t1 = new TeacherEntity("Filipa");
        TeacherEntity t2 = new TeacherEntity("Nuno");
        TeacherEntity t3 = new TeacherEntity("Milton");

        em.persist(t1);
        em.persist(t2);
        em.persist(t3);

        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
