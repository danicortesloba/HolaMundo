public class Road {

    private int maxSpeed;
    private RoadTypes roadType;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Road( RoadTypes roadType) {
        this.roadType = roadType;
        defineSpeedLimit(roadType);
    }

    private void defineSpeedLimit(RoadTypes roadType) {
        if(roadType == RoadTypes.CITY){
            this.maxSpeed = 50;
        }
        else if(roadType == RoadTypes.HIGHWAY){
            this.maxSpeed = 120;
        }
        else {
            System.out.println("Tipo de calle no válida");
        }
    }
}
