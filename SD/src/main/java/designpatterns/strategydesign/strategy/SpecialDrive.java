package designpatterns.strategydesign.strategy;

import designpatterns.strategydesign.strategy.DriveStrategy;

public class SpecialDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Drive Active");
    }
}
