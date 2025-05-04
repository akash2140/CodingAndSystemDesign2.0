package designpatterns.observerdesign.observables;

import designpatterns.observerdesign.observers.Observer;

public interface Observable {

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifySubscribers();

    public void setStock(Integer newStock);
}
