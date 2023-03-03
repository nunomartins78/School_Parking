package mindswap.jpa.entity.Resources;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeacherEntity extends Person {

    @OneToMany(targetEntity = VehicleEntity.class)
    private List<VehicleEntity> vehicleEntity = new ArrayList<>();

    @OneToOne(targetEntity = ParkingSpace.class)
    private ParkingSpace parkingSpace;

    public TeacherEntity() {
        super();
    }

    public TeacherEntity(String name) {
        super(name);
    }

    public TeacherEntity(String name, ParkingSpace parkingSpace, int age){
        super(name, age);
        this.parkingSpace = parkingSpace;
    }

    public TeacherEntity(int id, String name, ParkingSpace parkingSpace, int age){
        super(id, name, age);
        this.parkingSpace = parkingSpace;
    }

    public void print() {
        System.out.println("TeacherEntity{" +
                "id = " + getId() +
                ", name = " + getName() +
                ", age = " + getAge() +
                ", vehicle = " + vehicleEntity +
                ", parkingSpace = " + parkingSpace +
                '}');
    }
}
