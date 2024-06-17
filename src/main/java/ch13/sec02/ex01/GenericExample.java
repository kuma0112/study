package ch13.sec02.ex01;

public class GenericExample {
    public static void main(String[] args) {
        Product<TV, String> product1 = new Product<>();
        product1.setKind(new TV());
        product1.setModel("OLED");

        TV tv = product1.getKind();
        String model = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("포니");
    }
}
