package toy_fabric;

public class Lego extends Toy{
    public Lego(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }

    // переопределила метод toString
    @Override
    public String toString() {
        return "Конструктор лего (id: " + super.getId() + ", название: " + super.getName() + ", количество: " + super.getQuantity() + ", вес в %: " + super.getRate() + "\n";
    }
}
