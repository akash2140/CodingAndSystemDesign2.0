package designs.parkinglot;

import designs.parkinglot.manager.ParkingSpotManager;
import designs.parkinglot.manager.ParkingSpotManagerFactory;
import designs.parkinglot.parkingspot.ParkingSpot;
import designs.parkinglot.vehicle.Vehicle;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

public class Ticket {

    public Integer id;
    public Long entryTime;
    public ParkingSpotManager parkingSpotManager;
    public ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ParkingSpot parkingSpot;

    public Ticket generateTicket(Vehicle vehicle){

        //Generate some random Id , If it PK in DB, Auto generated.
        this.parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getType());
        this.parkingSpot = this.parkingSpotManager.findSpace();
        this.entryTime = System.currentTimeMillis();
        parkingSpot.parkvehicle(vehicle);
        //Do some persistance operations.
        return this;
    }

}
