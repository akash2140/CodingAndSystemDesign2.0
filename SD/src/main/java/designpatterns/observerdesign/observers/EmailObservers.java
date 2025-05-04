package designpatterns.observerdesign.observers;

import designpatterns.observerdesign.observables.Observable;

public class EmailObservers implements Observer{

    String emailId;
    Observable observable;

    public EmailObservers(String emailId,Observable observable){

        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {

        System.out.println("Email sent to : "+ emailId);
    }
}
