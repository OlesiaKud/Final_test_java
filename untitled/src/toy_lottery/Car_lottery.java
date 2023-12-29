package toy_lottery;

import toy_fabric.Car;
import toy_fabric.Toy;

public class Car_lottery implements Lottery{
    @Override
    public Toy lottery(int id, String name, int quantity, int rate) {
        return new Car(id, name, quantity, rate);
    }
}
