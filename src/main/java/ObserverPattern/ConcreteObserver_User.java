package ObserverPattern;

public class ConcreteObserver_User implements Observer{
    private String name;
    private Subject chatroom;

    public ConcreteObserver_User(String name, Subject chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    @Override
    public void update(String message) {
        String newMessage = chatroom.getUpdate();
        System.out.println(name + " received: " + newMessage);
    }
}
