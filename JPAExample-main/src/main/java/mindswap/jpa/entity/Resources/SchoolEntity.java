package mindswap.jpa.entity.Resources;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

public class SchoolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)

    @OneToMany(targetEntity = ParkingSpace.class)
    private List <ParkingSpace> spot = new LinkedList<>();

    @OneToMany(targetEntity = TeacherEntity.class)
    private List <TeacherEntity> teacher = new LinkedList<>();

    public List<TeacherEntity> getTeacher(){
        return teacher;
    }

    public List<ParkingSpace> getSpot(){
        return spot;
    }

}
