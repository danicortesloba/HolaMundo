import java.util.List;

public class TrafficJam {

    private List<Transportation> transportationInJam;

    public TrafficJam(List<Transportation> transportationInJam) {
        this.transportationInJam = transportationInJam;
    }

    public void startTrafficNoises() {
        for (Transportation transportation:transportationInJam) {
            transportation.makeTrafficNoise();
        }
    }
}
