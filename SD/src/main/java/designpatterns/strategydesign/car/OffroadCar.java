package designpatterns.strategydesign;

public class OffroadCar {
    DriveStrategy driveStrategy;
    public OffroadCar(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
}
