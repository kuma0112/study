package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject_Chatroom TeamFourChatroom = new ConcreteSubject_Chatroom();
        PriorityObserver sms = new ConcretePriorityObserver_User("sms", TeamFourChatroom,1);
        PriorityObserver kbo = new ConcretePriorityObserver_User("kbo", TeamFourChatroom,2);
        PriorityObserver kyc = new ConcretePriorityObserver_User("kyc", TeamFourChatroom,3);
        PriorityObserver kge = new ConcretePriorityObserver_User("kge", TeamFourChatroom,4);
        PriorityObserver ysj = new ConcretePriorityObserver_User("ysj", TeamFourChatroom,5);
        TeamFourChatroom.register(sms);
        TeamFourChatroom.register(kbo);
        TeamFourChatroom.register(kyc);
        TeamFourChatroom.register(kge);
        TeamFourChatroom.register(ysj);

        TeamFourChatroom.postMessage("4조는 최고야!");
    }
}
