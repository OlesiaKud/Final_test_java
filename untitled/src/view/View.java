package view;

import toy_fabric.Toy;
import toy_lottery.Car_lottery;
import toy_lottery.Doll_lottery;
import toy_lottery.Lego_lottery;
import toy_lottery.Lottery;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class View {
    public void main_menu() {
//        создаем экземпляры розыгрыша игрушек
        Lottery car_Lottery = new Car_lottery();
        Lottery doll_Lottery = new Doll_lottery();
        Lottery lego_Lottery = new Lego_lottery();
        Lottery teddy_Lottery = new Lego_lottery();
        System.out.println("Розыгрыш призов в магазине игрушек");
        Queue<Toy> queue = new PriorityQueue<>((t2, t1) -> t2.getRate() - t1.getRate());

//запрашиваем сколько будет разных видов игрушек участвовать в розыгрыше и добавляем их в очередь

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество машинок(число) :");
        try {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                queue.offer(car_Lottery.lottery(1, "машинка" , count, 20));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }

        System.out.println("Введите количество кукол(число) :");
        try {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                queue.offer(doll_Lottery.lottery(2, "куколка-фея" , count, 30));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }

        System.out.println("Введите количество конструкторов(число) :");
        try {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                queue.offer(lego_Lottery.lottery(3, "lego", count, 50));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
        System.out.println("Введите количество мягких игрушек(число) :");
        try {
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                queue.offer(teddy_Lottery.lottery(4, "медвежонок" , count, 80));
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
        scanner.close();
//        добавляем в файл по порядку выхода из очереди - выигрывают первые, те что легче.
//        Изменить можно в строке 22 "Queue<Toy> queue = new PriorityQueue<>((t2, t1) -> t2.getRate() - t1.getRate());"
        try(FileWriter writer = new FileWriter("D:\\study\\final_test\\task_2\\untitled\\src\\toy_lottery.txt");) {
            for (int i = 0; i < 10; i++) {
                writer.write(String.valueOf(queue.poll()));
            }
            System.out.println("Розыгрыш прошёл успешно, данные записаны в файл toy_lottery.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла");
            e.printStackTrace();
        }
    }
}
