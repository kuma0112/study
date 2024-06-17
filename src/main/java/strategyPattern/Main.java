package strategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item iphone = new Item("iphone", 100000);
        Item galaxy = new Item("galaxy", 50000);

        cart.addItem(iphone);
        cart.addItem(galaxy);

        cart.pay(new LunaCardStrategy("test@email.com", "1234!"));
        cart.pay(new KAKAOCardStrategy("이름", "카드 번호", "cvv", "날짜"));
    }
}
