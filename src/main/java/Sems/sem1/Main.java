package Sems.sem1;

// Шпора по именованию
//iApple -> appleCount
//lowerCamelCase -> methods, vars
//UpperCamelCase -> classes


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Список задач:
                1) Запросить у пользователя имя и поприветсвовать его.
                2) В данном массиве найти самую длинную последовательность из еденичек.
                3)\s""");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задачи");
        String number = scan.nextLine();
        switch (number) {
            case "1" -> ex1();
            case "2" -> ex2();
        }
    }

    private static void ex1() {
        System.out.println("Задача 1.");
        System.out.println("Запросить имя и поприветсвовать пользователя.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?");
        String name = scan.nextLine();
        System.out.printf("Привет, %s!\n", name);
    }

    public static void ex2(){
        System.out.println("Задача 2.");
        System.out.println("В данном массиве найти самую длинную последовательность из единичек.");
        int[] arr = new int[] {0, 0, 0, 0, 1, 1, 1, 0, 1, 1};
        int counter = 0;
        int newCounter = 0;
        for (int j : arr) {
            if (j == 1) {
                newCounter++;
            } else {
                newCounter = 0;
            }
            if (newCounter >= counter) {
                counter = newCounter;
            }
        }

        System.out.println(counter);
    }
}
