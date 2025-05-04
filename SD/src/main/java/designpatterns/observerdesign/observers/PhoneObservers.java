package designpatterns.observerdesign.observers;

import designpatterns.observerdesign.observables.Observable;

public class PhoneObservers implements Observer{

    String username;
    Observable observable;

    public PhoneObservers(String username,Observable observable){

        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {

        System.out.println("SMS sent to : "+ username);
    }
}
