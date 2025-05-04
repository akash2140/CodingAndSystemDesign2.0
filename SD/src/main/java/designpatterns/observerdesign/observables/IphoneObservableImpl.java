package designpatterns.observerdesign.observables;

import designpatterns.observerdesign.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements  Observable{

    List<Observer> observerList = new ArrayList<>();
    Integer stock = 0;
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for(Observer observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStock(Integer newStock) {

        if(stock == 0){
            notifySubscribers();
        }
        this.stock = newStock;
    }
}
