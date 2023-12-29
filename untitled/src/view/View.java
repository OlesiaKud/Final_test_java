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

        Queue<Toy> queue = new PriorityQueue<>((t1, t2) -> t2.getRate() - t1.getRate());
        System.out.println("Розыгрыш призов в магазине игрушек");
//        добавляем в очередь работает и без очереди
//        queue.offer(car_Lottery.lottery(1, "машинка" , 5, 20));
//        queue.offer(doll_Lottery.lottery(2, "куколка" , 5, 30));
//        queue.offer(lego_Lottery.lottery(3, "lego", 3, 50));
//        queue.offer(teddy_Lottery.lottery(4, "медвежонок" , 2, 80));
        Random random = new Random();
//        добавляем в файл
        try(FileWriter writer = new FileWriter("D:\\study\\final_test\\task_2\\untitled\\src\\toy_lottery.txt");) {
            Toy toy = null;
            for (int i = 0; i < 10; i++) {
                int randomValue = random.nextInt(100);
                if (randomValue <= 20) {
                    toy = teddy_Lottery.lottery(4, "медвежонок" , 10, 80);
                } else if  (randomValue <= 50) {
                    toy = lego_Lottery.lottery(3, "lego city", 30, 50);
                } else if (randomValue <= 70) {
                    toy = doll_Lottery.lottery(2, "куколка-фея" , 50, 20);
                } else if (randomValue <= 80) {
                    toy = car_Lottery.lottery(1, "машинка lada", 50, 10);
                }
                writer.write(toy.toString());
            }
            System.out.println("Розыгрыш прошёл успешно, данные записаны в файл toy_lottery.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла");
            e.printStackTrace();
        }

    }



}
