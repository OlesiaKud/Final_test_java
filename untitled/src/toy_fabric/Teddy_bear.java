package toy_fabric;

public class Teddy_bear extends Toy{
    public Teddy_bear(int id, String name, int quantity, int rate) {
        super(id, name, quantity, rate);
    }
    // переопределила метод toString
    @Override
    public String toString() {
        return "Плюшевый мишка (id: " + super.getId() + ", название: " + super.getName() + ", количество: " + super.getQuantity() + ", вес в %: " + super.getRate() + "\n";
    }
}
