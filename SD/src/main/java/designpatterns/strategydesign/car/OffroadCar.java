package designpatterns.strategydesign.car;

import designpatterns.strategydesign.strategy.DriveStrategy;
import designpatterns.strategydesign.strategy.SpecialDrive;

public class OffroadCar extends Vehicle{
    public OffroadCar(){
       super(new SpecialDrive());
    }
}
