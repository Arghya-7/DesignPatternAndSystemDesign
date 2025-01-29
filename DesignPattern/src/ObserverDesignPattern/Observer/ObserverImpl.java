package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.ObservableImpl;

public class ObserverImpl implements Observer{
    String name;
    public ObserverImpl(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println("Username = " + this.name + " Message :" +message);
    }
}
