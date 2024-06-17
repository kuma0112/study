package ch13.sec02.ex02;

public class CarAgency implements Rentable<Car> {

    @Override
    public Car rent() {
        return new Car();
    }
}
