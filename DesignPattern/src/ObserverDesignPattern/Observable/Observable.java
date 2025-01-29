package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifySubscribers();
    void update(String message);
}
