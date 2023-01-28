package Homeworks.HW3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Список задач:
                    1. Пусть дан произвольный список целых чисел, удалить из него четные числа\s
                    (в языке уже есть что-то готовое для этого)
                                    
                    2. Задан целочисленный список ArrayList.\s
                    Найти минимальное, максимальное и среднее арифметическое из этого списка.
                                        
                    Для выхода введите любое незначащее число
                    """);

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер задачи");
            String number = scan.next();
            switch (number) {
                case "1" -> ex1();
                case "2" -> ex2();
                default -> System.exit(0);
            }
        }
    }

    private static void ex1() {
        System.out.println("""
                           Задача 1.
                           Список задач:
                           1. Пусть дан произвольный список целых чисел, удалить из него четные числа\s
                           (в языке уже есть что-то готовое для этого)
                           """);

        Random rng = new Random();
        int size = rng.nextInt(2, 11);
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("Создан список: ");
        for (int i = 0; i < size; i++) {
            list.add(rng.nextInt(0, 5));
            System.out.printf("%s ", list.get(i));
        }
        System.out.println();

        System.out.println("Удаляем четные числа");
        list.removeIf(num -> num % 2 == 0);
        System.out.println();

        System.out.println("Результат операции: ");
        for (Integer i: list) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    private static void ex2() {
        System.out.println("""
                Задача 2.  \s
                Задан целочисленный список ArrayList.\s
                Найти минимальное, максимальное и среднее арифметическое из этого списка.""");

        Random rng = new Random();
        int size = rng.nextInt(2, 11);
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.println("Создан список: ");
        for (int i = 0; i < size; i++) {
            list.add(rng.nextInt(0, 50));
            System.out.printf("%s ", list.get(i));
        }
        System.out.println();

        double average = 0;
        int max = list.get(0);
        int min = list.get(0);

        for (Integer i: list) {
            average += i;
            if (min > i) {
                min = i;
            } else if (max < i) {
                max = i;
            }
        }
        average /= list.size();
        System.out.printf("Min = %d, Max = %d, Average = %.2f \n", min, max, average);
    }
}
