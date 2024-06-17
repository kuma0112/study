package ch13.sec02.ex02;

import ch13.sec02.ex02.Car;

public class GenericExample {
    public static void main(String[] args) {
    HomeAgency homeAgency = new HomeAgency();
    Home home = homeAgency.rent();
    // 이렇게 쓸 수도 있겠지만 좀 더 oop하게

    Rentable<Home> homeAgency2 = new HomeAgency();
    Home rentableHome = homeAgency.rent();

    Rentable<Car> carAgency = new CarAgency();
    Car car = carAgency.rent();
    }
}
