package strategyWithFactoryPattern;

import strategyPattern.Item;
import strategyPattern.KAKAOCardStrategy;
import strategyPattern.LunaCardStrategy;
import strategyPattern.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy strategy = PaymentStrategyFactory.createStrategy("KAKAOCard");
        strategy.pay(100);

        strategy = PaymentStrategyFactory.createStrategy("PayPal");
        strategy.pay(200);
    }
}
