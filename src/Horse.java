public class Horse extends Animal implements Transportation {

    private int speed;

    public Horse(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void makeNoise(){
        System.out.println("Brrrrrr Brrrrrr");
    }

    public void makeTrafficNoise(){
        makeNoise();
    }

    public void accelerate(int acceleration){
        this.speed = this.speed + acceleration;
        System.out.println("Ahora la velocidad de tu caballo es de " + speed);
    }

    private void jog(){
        this.speed = this.speed + 20;
    }

    private void gallop(){
        this.speed = this.speed + 50;
    }
}
