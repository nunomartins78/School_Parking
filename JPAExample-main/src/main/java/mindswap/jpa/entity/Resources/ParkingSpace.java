package mindswap.jpa.entity.Resources;

import javax.persistence.*;
import java.util.List;

@Entity
public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false, unique = true)
    private int id;
    @Column(name = "Zone", nullable = false)
    private String zone;
    @Column(name = "Parking_Space", nullable = false, unique = true)
    private int spot;

    public ParkingSpace(String zone, int spot) {
        this.zone = zone;
        this.spot = spot;
    }
}
