package mindswap.jpa.entity.Resources;

import javax.persistence.*;

@Entity
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private int id;
    @Column(name = "Licence_Plate", nullable = false)
    private String licencePlate;

    @Column(name = "Vehicle", nullable = false)
    static
    String vehicle;

    public VehicleEntity(String licencePlate, String vehicle){
        this.licencePlate = licencePlate;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public java.lang.String getLicencePlate() {
        return licencePlate;
    }

    public static String getVehicle() {
        return vehicle;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
