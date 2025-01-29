package ObserverDesignPattern;

import ObserverDesignPattern.Observable.Observable;
import ObserverDesignPattern.Observable.ObservableImpl;
import ObserverDesignPattern.Observer.Observer;
import ObserverDesignPattern.Observer.ObserverImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Observer ram = new ObserverImpl("Ram");
        Observer sham = new ObserverImpl("Sham");


        Observable observable = new ObservableImpl(new ArrayList<>());

        observable.add(ram);
        observable.add(sham);
        observable.update("Product 1 launched");

        observable.remove(sham);
        observable.update("Product 2 launched");
    }
}
