package designs.parkinglot.parkingspot;

import designs.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {

    Integer id;
    Vehicle vehicle;
    public Boolean isEmpty;
    protected abstract Double price();

    public void parkvehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public  void unparkvehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }

}
