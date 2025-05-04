package designs.parkinglot;

public abstract class ParkingSpot {

    Integer id;
    Vehicle vehicle;
    public Boolean isEmpty;
    protected abstract Double price();

}
