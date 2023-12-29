package toy_fabric;

public class Teddy_bear extends Toy{
    public Teddy_bear(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }

    @Override
    public String toString() {
        return "Плюшевый мишка";
    }
}
