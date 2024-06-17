package strategyWithFactoryPattern;

public class PaymentStrategyFactory {
    public static PaymentStrategy createStrategy(String type) {
        switch (type) {
            case "KAKAOCard":
                return new KAKAOCardStrategy();
            case "LunaCard":
                return new LunaCardStrategy();
            default:
                throw new IllegalArgumentException("Unknown payment type: " + type);
        }
    }
}
