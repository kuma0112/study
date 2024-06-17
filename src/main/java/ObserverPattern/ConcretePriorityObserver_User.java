package ObserverPattern;

public class ConcretePriorityObserver_User implements PriorityObserver{
    private String name;
    private Subject chatroom;
    private int priority;

    public ConcretePriorityObserver_User(String name, Subject chatroom, int priority) {
        this.name = name;
        this.chatroom = chatroom;
        this.priority = priority;
    }

    @Override
    public void update(String message) {
        String newMessage = chatroom.getUpdate();
        System.out.println(name + " received: " + newMessage);
    }

    @Override
    public int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(PriorityObserver o) {
        return Integer.compare(this.priority, o.getPriority());
    }
}
