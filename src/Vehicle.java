public class Vehicle {
    private String color;
    private int speed;
    private int numberOfWheels;
    private Road road;

    public Vehicle(String color, int speed, int numberOfWheels, Road road) {
        this.color = color;
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.road = road;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void allowAcceleration(int acceleration){
        this.speed = this.speed + acceleration;
        System.out.println("Subimos tu velocidad por " + acceleration + ". Ahora tu velocidad es de " + speed + ". " +
                "Recuerda que el máximo  es de " + this.road.getMaxSpeed()  + ".");
    }

    private void prohibitAcceleration(int acceleration){
        System.out.println("Exceso de velocidad. Tu velocidad actual es de " + speed + " y el máximo  es de " +
                this.road.getMaxSpeed() + ".");
        this.speed = this.road.getMaxSpeed() - 5;
        System.out.println("Para tu protección, bajamos tu velocidad a " + speed + ".");
    }

    public void accelerate(int acceleration) {
        if(this.speed + acceleration <= this.road.getMaxSpeed()){
            allowAcceleration(acceleration);
        }
        else {
            prohibitAcceleration(acceleration);
        }
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void checkSpeed() {
        System.out.println("La velocidad actual es: " + this.speed);
    }

    public void honk() {
        System.out.println("piip");
    }
}
