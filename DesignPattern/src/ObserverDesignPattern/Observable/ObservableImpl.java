package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

import java.util.List;

public class ObservableImpl implements Observable{
    List<Observer> observerList;
    String latestMessage;

    public ObservableImpl(List<Observer> observerList){
        this.observerList = observerList;
    }
    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer:observerList){
            observer.update(this.latestMessage);
        }
    }

    @Override
    public void update(String message){
        this.latestMessage = message;
        notifySubscribers();
    }
}
