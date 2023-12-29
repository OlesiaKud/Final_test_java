package toy_lottery;

import toy_fabric.Toy;

public interface Lottery {
    Toy lottery(int id, String name, int quantity, int rate);
}
