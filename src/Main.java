import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Road cityRoad = new Road( RoadTypes.CITY);
        Road highwayRoad = new Road(RoadTypes.HIGHWAY);

        Car carOne = new Car("yellow", 60, 4, cityRoad, 8);
        Car carTwo = new Car("green", 80, 4, highwayRoad, 4);

        speedTesting(carOne, carTwo);

        Truck truckOne = new Truck("blue", 90, 4, cityRoad, 500);
        Vehicle carThree = new Car("yellow", 90, 4, cityRoad, 8);
        Vehicle truckTwo = new Truck("blue", 150, 4, highwayRoad, 1000);

        honkTesting(carOne, truckOne, carThree, truckTwo);

        startTrafficJam(carOne, carTwo, truckOne, carThree, truckTwo);
    }

    private static void startTrafficJam(Car carOne, Car carTwo, Truck truckOne, Vehicle carThree, Vehicle truckTwo) {
        List<Vehicle> vehiclesInJam = new ArrayList();
        vehiclesInJam.add(carOne);
        vehiclesInJam.add(carTwo);
        vehiclesInJam.add(carThree);
        vehiclesInJam.add(truckOne);
        vehiclesInJam.add(truckTwo);

        TrafficJam jamOne = new TrafficJam(vehiclesInJam);
        jamOne.honkVehicles();
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
