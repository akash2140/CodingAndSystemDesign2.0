package designs.parkinglot;

public class Entrygate {

    private String gateId;
    private final double x, y;

    public Entrygate(String gateId, double x, double y) {
        this.gateId = gateId;
        this.x = x;
        this.y = y;
    }

    public String getGateId() {
        return gateId;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
