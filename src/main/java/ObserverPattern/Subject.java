package ObserverPattern;

// 상태 변화를 감시하고 있는 대상
public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
    String getUpdate();
}
