package toy_fabric;

public class Lego extends Toy{
    public Lego(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }

    @Override
    public String toString() {
        return "Конструктор лего";
    }
}
