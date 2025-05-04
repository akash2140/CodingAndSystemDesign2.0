package designs.parkinglot.manager;

import designs.parkinglot.vehicle.VehicleType;

import java.util.ArrayList;

public class ParkingSpotManagerFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){

        switch (vehicleType){

            case Two_Wheeler:
                return new TwoWheelerParkingSpotManager();

            case Four_Wheeler:
                return new FourWheelerParkingSpotManager();

            default:
                throw new RuntimeException("Select Proper Vehicle Type");
        }
    }
}
