package Homeworks.HW6;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Random rng = new Random();

        Laptop l1 = new Laptop(rng.nextInt(100_000, 999_999), 1000, 4, false, "Blue", "IPS");
        Laptop l2 = new Laptop(rng.nextInt(100_000, 999_999), 1000, 4, false, "Blue", "IPS");
        Laptop l3 = new Laptop(rng.nextInt(100_000, 999_999), 1000, 8, false, "Red", "IPS");
        Laptop l4 = new Laptop(rng.nextInt(100_000, 999_999), 1500, 8, true, "Yellow", "VA");
        Laptop l5 = new Laptop(rng.nextInt(100_000, 999_999), 1500, 16, true, "Black", "VA");
        Laptop l6 = new Laptop(rng.nextInt(100_000, 999_999), 1500, 16, false, "Black", "VA");
        Laptop l7 = new Laptop(rng.nextInt(100_000, 999_999), 2000, 32, false, "Yellow", "TN");
        Laptop l8 = new Laptop(rng.nextInt(100_000, 999_999), 2000, 32, true, "Red", "TN");
        Laptop l9 = new Laptop(rng.nextInt(100_000, 999_999), 3000, 64, true, "Gold", "TN");
        Laptop l10 = new Laptop(rng.nextInt(100_000, 999_999), 3000, 64, true, "Gold", "TN");

        List<Laptop> laptops = List.of(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10);


        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("""
                                Выберите команду:
                                1) Вывести весь список ноутбуков.
                                2) Фильтр по цене.
                                3) Завершить работу.
                               """);
            String input = scan.next();

            switch (input) {
                case ("1") -> {
                    for (Laptop laptop : laptops) {
                        System.out.println("Ноутбук № " + (laptops.indexOf(laptop) + 1));
                        laptop.getInfo();
                        System.out.println();
                    }
                }
                case ("3") -> System.exit(0);

                case ("2") -> {
                    System.out.println("Введите минимальную цену ноутбука (1000$ - 3000$)");
                    int price = scan.nextInt();
                    for (Laptop laptop : laptops) {
                        if (laptop.getPrice() >= price) {
                            System.out.println("Ноутбук № " + (laptops.indexOf(laptop) + 1));
                            laptop.getInfo();
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
