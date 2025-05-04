package designpatterns.strategydesign;

public class NormalCar {

    DriveStrategy driveStrategy;
    public NormalCar(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
}
