import java.util.Iterator;
import java.util.ArrayList;

public class TrafficJam {

    private ArrayList list;

    public TrafficJam(ArrayList list) {
        this.list = list;
    }

    public void honkVehicles() {
        Iterator itr = this.list.iterator();
        while(itr.hasNext()) {
            Object vehicle = itr.next();
            vehicle.honk();
            System.out.println(vehicle);
        }
    }
}
