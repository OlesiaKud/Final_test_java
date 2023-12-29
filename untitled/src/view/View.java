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
        Lottery car_Lottery = new Car_lottery();
        Lottery doll_Lottery = new Doll_lottery();
        Lottery lego_Lottery = new Lego_lottery();
        Lottery teddy_Lottery = new Lego_lottery();

        Queue<Toy> queue = new PriorityQueue<>((t1, t2) -> t2.getRate() - t1.getRate());
        System.out.println("Розыгрыш призов в магазине игрушек");
        queue.offer(car_Lottery.lottery(1, "машинка" , 5, 20));
        queue.offer(doll_Lottery.lottery(1, "куколка" , 5, 30));
        queue.offer(lego_Lottery.lottery(1, "lego", 3, 50));
        queue.offer(teddy_Lottery.lottery(1, "медвежонок" , 2, 80));
        Random random = new Random();
        try(FileWriter writer = new FileWriter("D:\\study\\final_test\\task_2\\untitled\\src\\toy_lottery.txt");) {
            Toy toy = null;
            for (int i = 0; i < 10; i++) {
                int randomValue = random.nextInt(100);

                if (randomValue <= 20) {
                    toy = teddy_Lottery.lottery(1, "медвежонок" , 10, 80);
                } else if  (randomValue <= 50) {
                    toy = lego_Lottery.lottery(1, "lego", 30, 50);
                } else if (randomValue <= 70) {
                    toy = doll_Lottery.lottery(1, "куколка" , 50, 20);
                } else if (randomValue <= 80) {
                    toy = car_Lottery.lottery(1, "машинка", 50, 10);
                }
                String prize = "ID: " + toy.getId() +", название: " + toy.getName() + ", вес в % от 100: "+ toy.getRate() + "\n";
                writer.write(prize);
            }

            System.out.println("Розыгрыш прошёл успешно, данные записаны в файл toy_lottery.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла");
            e.printStackTrace();
        }

    }



}
