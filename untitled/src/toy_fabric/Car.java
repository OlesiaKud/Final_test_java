package toy_fabric;

public class Car extends Toy {
    public Car(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }

    // переопределила метод toString
    @Override
    public String toString() {
        return "Машинка (id: " + super.getId() + ", название: " + super.getName() + ", количество: " + super.getQuantity() + ", вес в %: " + super.getRate() + "\n";
    }
}
