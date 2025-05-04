package designpatterns.strategydesign;

import designpatterns.strategydesign.car.NormalCar;
import designpatterns.strategydesign.car.SportsCar;
import designpatterns.strategydesign.car.Vehicle;

public class StrategyDesign {

    public static void main(String[] args) {

        Vehicle v1 = new SportsCar();
        v1.drive();

        Vehicle v2 = new NormalCar();
        v2.drive();
    }
}
