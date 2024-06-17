package strategyWithFactoryPattern;

import strategyWithFactoryPattern.PaymentStrategy;

public class LunaCardStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LunaCard");
    }
}
