package mindswap.jpa.entity.Resources;

import javax.persistence.*;

@Entity
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, unique = true)
    private int id;
    @Column(name = "Licence_Plate", nullable = false)
    private String licencePlate;
    enum VehicleType{
        CAR,
        MOTORCYCLE
    }
    @Column(name = "Vehicle", nullable = false)
    VehicleType vehicle;

    public VehicleEntity(String licencePlate, VehicleType vehicle){
        this.licencePlate = licencePlate;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public VehicleType getVehicle() {
        return vehicle;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setVehicle(VehicleType vehicle) {
        this.vehicle = vehicle;
    }
}
