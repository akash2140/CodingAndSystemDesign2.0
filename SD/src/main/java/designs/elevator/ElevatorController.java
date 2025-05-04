package designs.elevator;

public class ElevatorController {

    private ElevatorCar elevatorCar;

    //Also should contain the relevant data structure to hold Elevator values.

    public void acceptNewRequest(Integer floorId, Direction direction){

        //Update the datastructure that we are using...

        controlElevator(floorId,direction);
    }

    public void controlElevator(int destinationFloor, Direction direction){

        //will call move Elevator object of Elevator car.
        elevatorCar.move(destinationFloor,direction);
    }
}
