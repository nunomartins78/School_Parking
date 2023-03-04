package mindswap.jpa.entity.Resources;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TeacherEntity extends Person {

/*    @OneToMany(targetEntity = VehicleEntity.class)
    private List<VehicleEntity> vehicleEntity = new ArrayList<>();*/

    @OneToOne(targetEntity = ParkingSpace.class)
    private ParkingSpace parkingSpace;
    @OneToOne(targetEntity = VehicleEntity.class)
    private VehicleEntity vehicle;

     public TeacherEntity(String name, int age, VehicleEntity vehicle, ParkingSpace parkingSpace){
        super(name, age);
        this.vehicle = vehicle;
        this.parkingSpace = parkingSpace;
    }


    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void print() {
        System.out.println("TeacherEntity{" +
                "id = " + getId() +
                ", name = " + getName() +
                ", age = " + getAge() +
                ", vehicle = " + VehicleEntity.getVehicle() +
                ", parking space = " + getParkingSpace().toString() +
                '}');
    }
}
