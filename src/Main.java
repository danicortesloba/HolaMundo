public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car carOne = new Car("yellow", 60, 4);
        Car carTwo = new Car("green", 80, 4);

        int carOneSpeed = carOne.getSpeed();
        System.out.println(carOneSpeed);
        carOne.setSpeed(20);
        carOneSpeed = carOne.getSpeed();
        System.out.println(carOneSpeed);

        carOne.checkSpeed();
        carTwo.checkSpeed();

        carOne.accelerate(50, "Highway");
        carTwo.accelerate(100, "City");
        carOne.accelerate(120, "City");
        carOne.accelerate(10, "Highway");

    }
}
