package Homeworks.HW7.Ex2;

import java.util.Random;
import java.util.Scanner;

public class HW7Ex2 {
    public static void main(String[] args) {
        Random rng = new Random();
        Cat c1 = new Cat("Кузя", rng.nextInt(0, 2), rng.nextInt(0, 101));
        Owner o1 = new Owner("Default", rng.nextInt(1,101));

        o1.showInfo();
        System.out.println();
        c1.showInfo();
        System.out.println();
        while (true) {

            System.out.println("""
                              ---------------------------------------------
                              Введите команду для взаимодействия с котиком.
                              1) Позвать котика.
                              2) Погладить котика.
                              3) Сделать шажок к котику
                              Введите что угодно для выхода из программы.
                              ---------------------------------------------
                              """);

            Relations var = new Relations();

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер действия:");
            String number = scan.nextLine();
            switch (number) {
                case "1" -> var.call(o1, c1);
                case "2" -> var.Pet(o1, c1);
                case "3" -> {
                    var.step(o1, c1);
                    System.out.printf("%s сделал шаг к %s\n", o1.getName(), c1.getName());
                }
                default -> System.exit(0);
            }
            System.out.printf("Позиция %s: %s\n", o1.getName(), o1.getPosition());
            System.out.printf("Позиция %s: %s\n", c1.getName(), c1.getPosition());
        }
    }
}
