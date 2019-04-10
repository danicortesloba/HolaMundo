public class Car {
    private String color;
    private int speed;
    private int numberOfWheels;
    private static int maxSpeed;


    public Car(String color, int speed, int numberOfWheels) {
        this.color = color;
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;

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


    private void defineSpeedLimit(String roadType) {
        if(roadType == "City"){
            this.maxSpeed = 50;
        }

        else if(roadType == "Highway"){
            this.maxSpeed = 120;
        }
        else {
            System.out.println("Tipo de calle no válida");
        }

    }

    private void allowAcceleration(int acceleration, String roadType){
        this.speed = this.speed + acceleration;
        System.out.println("Subimos tu velocidad por " + acceleration + ". Ahora tu velocidad es de " + speed + ". Recuerda que el máximo para " + roadType + " es de " + maxSpeed  + ".");
    }

    private void prohibitAcceleration(int acceleration, String roadType){
        System.out.println("Exceso de velocidad. Tu velocidad actual es de " + speed + " y el máximo para " + roadType + " es de " + maxSpeed + ".");
        this.speed = maxSpeed - 5;
        System.out.println("Para tu protección, bajamos tu velocidad a " + speed + ".");
    }

    public void accelerate(int acceleration, String roadType) {
        defineSpeedLimit(roadType);
        if(this.speed + acceleration <= maxSpeed){
            allowAcceleration(acceleration, roadType);
        }
        else {
            prohibitAcceleration(acceleration, roadType);

        }

    }

    public void changeColor(String newColor) {
        this.color = newColor;

    }

    public void checkSpeed() {
        System.out.println("La velocidad actual es: " + this.speed);
    }
}