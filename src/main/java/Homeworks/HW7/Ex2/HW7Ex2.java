package Homeworks.HW7.Ex2;

import java.util.Random;
import java.util.Scanner;

public class HW7Ex2 {
    public static void main(String[] args) {
        Random rng = new Random();
        Pet c1 = new Pet("Cat", "Кузя", rng.nextInt(0, 2), rng.nextInt(0, 201));
        Owner o1 = new Owner("Default", rng.nextInt(1,201));

        o1.showInfo();
        System.out.println();
        c1.showInfo();
        System.out.println();
        while (true) {

            System.out.println("""
                              ---------------------------------------------
                              Введите команду для взаимодействия с питомцем.
                              1) Позвать питомца.
                              2) Погладить питомца.
                              3) Сделать шажок к питомцу.
                              Введите что угодно для выхода из программы.
                              ---------------------------------------------
                              """);

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер действия:");
            String number = scan.nextLine();
            switch (number) {
                case "1" -> c1.call(o1, c1);
                case "2" -> c1.pet(o1, c1);
                case "3" -> {
                    o1.step(o1, c1);
                    System.out.printf("%s сделал шаг к %s\n", o1.getName(), c1.getName());
                }
                default -> System.exit(0);
            }
            System.out.printf("Позиция %s: %s\n", o1.getName(), o1.getPosition());
            System.out.printf("Позиция %s: %s\n", c1.getName(), c1.getPosition());
        }
    }
}
