package toy_fabric;

import java.awt.color.ICC_ColorSpace;

public abstract class Toy{
//        абстрактный класс Игрушка, и его наследуют конкретные виды игрушке - куклы, машинки, конструкторы, плюшевые мишки
        private int id;
        private String name;
        private int quantity;
        private int rate;
// конструктор
        public Toy(int id, String name, int quantity, int rate) {
                this.id = id;
                this.name = name;
                this.quantity = quantity;
                this.rate = rate;
        }
//getters and setters
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public int getRate() {
                return rate;
        }

        public void setRate(int rate) {
                this.rate = rate;
        }
// переопределила метод toString
        @Override
        public String toString() {
                return "Игрушка (id: " + id + ", название: " + name + ", количество: "+ quantity + ", частота выпадения"+ rate;
        }
}