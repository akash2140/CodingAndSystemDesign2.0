package designs.parkinglot.vehicle;

public class Vehicle {
    protected String vehicleNo;

    protected VehicleType type;

    public Vehicle(String vehicleNo , VehicleType vehicleType){

        this.type = vehicleType;
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public VehicleType getType() {
        return type;
    }
}
