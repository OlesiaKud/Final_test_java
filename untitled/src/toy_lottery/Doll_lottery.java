package toy_lottery;

import toy_fabric.Doll;
import toy_fabric.Toy;

public class Doll_lottery implements Lottery {
    @Override
    public Toy lottery(int id, String name, int quantity, int rate) {
        return new Doll(id, name, quantity, rate);
    }
}
