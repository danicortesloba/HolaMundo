public class Truck extends Vehicle {

    private int loadCapacity;

    public  Truck(String color, int speed, int numberOfWheels, Road road, int loadCapacity) {
        super(color, speed, numberOfWheels, road );
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void honk() {
        System.out.println("brooom");
    }

}
