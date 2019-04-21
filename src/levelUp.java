import java.util.ArrayList;
import java.util.List;

public class levelUp {

    private static List<Transportation> transportationInJam;
    private static Road cityRoad = new Road( RoadTypes.CITY);
    private static Road highwayRoad = new Road(RoadTypes.HIGHWAY);

    private static Car carOne = new Car("yellow", 60, 4, cityRoad, 8);
    private static Car carTwo = new Car("green", 80, 4, highwayRoad, 4);
    private static Truck truckOne = new Truck("blue", 90, 4, cityRoad, 500);
    private static Vehicle carThree = new Car("yellow", 90, 4, cityRoad, 8);
    private static Vehicle truckTwo = new Truck("blue", 150, 4, highwayRoad, 1000);

    private static Horse apolo = new Horse("Apolo", 30);
    private static Cat mia = new Cat("Mia");


    public static void startMethods() {
        speedTesting(carOne, carTwo);
        honkTesting(carOne, truckOne, carThree, truckTwo);
        createTrafficJam();
        startPetting();
    }

    private static void startPetting() {
        apolo.pet();
        mia.pet();
    }

    private static void createTrafficJam() {
        transportationInJam = new ArrayList();
        transportationInJam.add(carOne);
        transportationInJam.add(carTwo);
        transportationInJam.add(carThree);
        transportationInJam.add(truckOne);
        transportationInJam.add(truckTwo);
        transportationInJam.add(apolo);


        startTrafficJam(transportationInJam);

        transportationInJam.clear();
        transportationInJam.add(carOne);
        startTrafficJam(transportationInJam);
    }

    private static void startTrafficJam(List<Transportation> transportationInJam) {
        TrafficJam jamOne = new TrafficJam(transportationInJam);
        jamOne.startTrafficNoises();
    }

    private static void honkTesting(Car carOne, Truck truckOne, Vehicle carThree, Vehicle truckTwo) {
        truckOne.honk();
        carOne.honk();
        carThree.honk();
        truckTwo.honk();
    }

    private static void speedTesting(Car carOne, Car carTwo) {
        int carOneSpeed = carOne.getSpeed();
        System.out.println(carOneSpeed);
        carOne.setSpeed(20);
        carOneSpeed = carOne.getSpeed();
        System.out.println(carOneSpeed);

        carOne.checkSpeed();
        carTwo.checkSpeed();

        carOne.accelerate(50);
        carTwo.accelerate(100);
        carOne.accelerate(120);
        carOne.accelerate(10);
    }
}
