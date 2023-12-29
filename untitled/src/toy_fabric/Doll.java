package toy_fabric;

public class Doll extends Toy{

    public Doll(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }

    @Override
    public String toString() {
       return "Кукла";
    }
}
