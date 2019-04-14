public class Main {
    public static void main(String[] args) {
        Road cityRoad = new Road( RoadTypes.CITY);
        Road highwayRoad = new Road(RoadTypes.HIGHWAY);

        Car carOne = new Car("yellow", 60, 4, cityRoad, 8);
        Car carTwo = new Car("green", 80, 4, highwayRoad, 4);

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

        Truck truckOne = new Truck("blue", 90, 4, cityRoad, 500);
        truckOne.checkSpeed();
        truckOne.honk();
        carOne.honk();

    }
}
