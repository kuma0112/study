package ObserverPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcreteSubject_Chatroom implements Subject {

    private List<PriorityObserver> observers;
    private String message;

    public ConcreteSubject_Chatroom() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer instanceof PriorityObserver priorityObserver) {
            if (!observers.contains(priorityObserver)) observers.add(priorityObserver);
            Collections.sort(observers);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (observer instanceof PriorityObserver) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        int count = 0;
        for (PriorityObserver observer : observers) {
            if (count >= 2) break;
            observer.update(message);
            count++;
        }
    }

    @Override
    public String getUpdate() {
        return this.message;
    }

    public void postMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
