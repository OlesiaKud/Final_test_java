package toy_lottery;

import toy_fabric.Teddy_bear;
import toy_fabric.Toy;

public class Teddy_bear_lottery implements Lottery{
    @Override
    public Toy lottery(int id, String name, int quantity, int rate) {
        return new Teddy_bear(id, name, quantity, rate);
    }
}
