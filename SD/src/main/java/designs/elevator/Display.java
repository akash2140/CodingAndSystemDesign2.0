package designs.elevator;

public class Display {

    private Integer floor;

    private Direction direction;

    public Display(Integer floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public Integer getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }
}
