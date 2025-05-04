package designpatterns.observerdesign;

import designpatterns.observerdesign.observables.IphoneObservableImpl;
import designpatterns.observerdesign.observers.EmailObservers;
import designpatterns.observerdesign.observers.Observer;
import designpatterns.observerdesign.observers.PhoneObservers;

public class Store {

    public static void main(String[] args) {

        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();

        Observer observer1 = new EmailObservers("xyz@gmail.com", iphoneObservable);
        Observer observer2 = new EmailObservers("xyz2@gmail.com", iphoneObservable);
        Observer observer3 = new PhoneObservers("xyz3", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStock(10);
        iphoneObservable.setStock(0);
        iphoneObservable.setStock(10);
    }
}
