package toy_fabric;

public class Car extends Toy {
    public Car(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }

    @Override
    public String toString() {
        return "Машина";
    }
}
