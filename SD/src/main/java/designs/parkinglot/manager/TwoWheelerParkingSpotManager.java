package designs.parkinglot.manager;

import designs.parkinglot.parkingspot.ParkingSpot;
import designs.parkinglot.parkingspot.TwoWheelerParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{

    static List<ParkingSpot> parkingSpotList = new ArrayList<>();

    public TwoWheelerParkingSpotManager(){
        super(parkingSpotList);
    }
}
