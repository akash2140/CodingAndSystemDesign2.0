package designpatterns.strategydesign;

public class SportsCar {

    DriveStrategy driveStrategy;
    public SportsCar(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

}
