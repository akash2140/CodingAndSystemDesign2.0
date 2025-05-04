package designpatterns.strategydesign.strategy;

import designpatterns.strategydesign.strategy.DriveStrategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Active");
    }
}
