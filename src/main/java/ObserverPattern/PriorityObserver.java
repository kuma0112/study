package ObserverPattern;

public interface PriorityObserver extends Observer, Comparable<PriorityObserver> {
    int getPriority();
}
