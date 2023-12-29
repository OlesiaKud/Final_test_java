package toy_lottery;

import toy_fabric.Lego;
import toy_fabric.Toy;

public class Lego_lottery implements Lottery{
    @Override
    public Toy lottery(int id, String name, int quantity, int rate) {
        return new Lego(id, name, quantity, rate);
    }
}
