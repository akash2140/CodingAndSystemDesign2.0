package designpatterns.strategydesign.car;

import designpatterns.strategydesign.strategy.DriveStrategy;
import designpatterns.strategydesign.strategy.NormalDrive;

public class NormalCar extends Vehicle{

    public NormalCar(){
        super(new NormalDrive());
    }
}
