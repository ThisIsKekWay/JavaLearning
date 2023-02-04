package Homeworks.HW4;

import java.util.*;

public class HW4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Список задач:
                    1. Реализовать консольное приложение, которое:
                    Принимает от пользователя и “запоминает” строки.
                    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,\s
                    а первая - последней.
                    Если введено revert, удаляет предыдущую введенную строку из памяти.
                    
                    2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет\s
                    “перевернутый” список.
                    
                    Введите 0 для выхода из программы.
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
        Deque<String> strings = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("""
                               Введите строку.
                               Введите print, чтобы вывести сохраненные значения.
                               Введите revert, чтобы удалить предыдущую строку.
                               Введите 0, чтобы вернуться к выбору задачи.
                               """);

            String str = scan.nextLine();
            switch (str) {
                case "print" -> {
                    if (strings.isEmpty()) {
                        System.out.println("Список пуст, показывать нечего!");
                    } else {
                        System.out.println(strings);
                    }
                }
                case "revert" -> {
                    try {
                        strings.removeFirst();
                    } catch (Exception e) {
                        System.out.println("Список пуст, удалять нечего!");
                    }
                }
                case "0" -> {
                    return;
                }
                default -> strings.addFirst(str);
            }
        }
    }

    private static void ex2() {
        while(true){
            Random rng = new Random();
            int size = rng.nextInt(2, 11);
            LinkedList<Integer> lst1 = new LinkedList<>();
            System.out.println("Создан список:");
            for (int i = 0; i < size; i++) {
                lst1.add(rng.nextInt(-100, 101));
            }
            System.out.println(lst1);

            if (size % 2 == 1){
                for (int i = 0; i < size / 2; i++) {
                    int buffer1 = lst1.get(i);
                    int buffer2 = lst1.get(size - i - 1);
                    lst1.set(i, buffer2);
                    lst1.set(size - i - 1, buffer1);
                }
            } else {
                for (int i = 0; i < size / 2; i++) {
                    int buffer1 = lst1.get(i);
                    int buffer2 = lst1.get(size - i - 1);
                    lst1.set(i, buffer2);
                    lst1.set(size - i - 1, buffer1);
                }
            }
            System.out.println("Перевернутый список:");
            System.out.println(lst1);

            System.out.println("Введите 0 для возврата к выбору задачи и что угодно для повтора этой программы:");
            Scanner scan = new Scanner(System.in);
            String command = scan.next();
            if (command.equals("0")) {
                return;
            }
        }



    }
}
