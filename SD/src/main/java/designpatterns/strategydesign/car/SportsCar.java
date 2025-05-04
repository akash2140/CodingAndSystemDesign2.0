package designpatterns.strategydesign.car;

import designpatterns.strategydesign.strategy.DriveStrategy;
import designpatterns.strategydesign.strategy.SpecialDrive;

public class SportsCar extends Vehicle{

    public SportsCar(){
        super(new SpecialDrive());
    }

}
