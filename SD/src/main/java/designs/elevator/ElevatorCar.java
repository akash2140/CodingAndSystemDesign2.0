package designs.elevator;

public class ElevatorCar {

    private Integer elevatorId;
    private Display display;
    private InternalButtons internalButtons;
    private ElevatorStatus elevatorStatus;
    private Integer currentFloor;
    public ElevatorCar(Integer elevatorId, Display display, InternalButtons internalButtons, ElevatorStatus elevatorStatus,  Integer currentFloor) {

        this.elevatorId = elevatorId;
        this.display = display;
        this.internalButtons = internalButtons;
        this.elevatorStatus = elevatorStatus;
        this.currentFloor = currentFloor;
    }

    public void move(int destinationFloor, Direction direction){
        //Do some logic
    }

    public Integer getElevatorId() {
        return elevatorId;
    }

    public Display getDisplay() {
        return display;
    }

    public InternalButtons getInternalButtons() {
        return internalButtons;
    }

    public ElevatorStatus getElevatorStatus() {
        return elevatorStatus;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }
}
