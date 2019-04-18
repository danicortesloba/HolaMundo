import java.util.Iterator;
import java.util.List;

public class TrafficJam {

    private List vehiclesInJam;

    public TrafficJam(List vehiclesInJam) {
        this.vehiclesInJam = vehiclesInJam;
    }

    public void honkVehicles() {
        Iterator<Vehicle> vehicleIterator = this.vehiclesInJam.iterator();
        while(vehicleIterator.hasNext()) {
            Vehicle vehicle = vehicleIterator.next();
            vehicle.honk();
        }
    }
}
