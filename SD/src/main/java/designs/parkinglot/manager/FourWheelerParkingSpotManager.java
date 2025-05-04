package designs.parkinglot.manager;

import designs.parkinglot.parkingspot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    static List<ParkingSpot> parkingSpotList = new ArrayList<>();

    public FourWheelerParkingSpotManager(){
        super(parkingSpotList);
    }

}
