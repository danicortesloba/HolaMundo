public class Car extends Vehicle {

    private int passengerCapacity;

    public  Car(String color, int speed, int numberOfWheels, Road road, int passengerCapacity) {
        super(color, speed, numberOfWheels, road );
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void honk() {
        System.out.println("pip pip");
    }

}