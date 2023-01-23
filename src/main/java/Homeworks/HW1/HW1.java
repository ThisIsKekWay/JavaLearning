package Homeworks.HW1;

import java.util.Random;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        int maintain = 1;
        do {
            System.out.println("""
                    Список задач:
                    1) Задать одномерный массив и найти в нем минимальный и максимальный элементы
                                    
                    2) Написать метод, который определяет, является ли введенный пользователем год високосным,\s
                    и возвращает в консоль boolean (високосный - true, не високосный - false).
                                    
                    3) Дан массив nums = [3,2,2,3] и число val = 3.
                    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
                    
                    Для выхода введите любое незначащее число
                    """);

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер задачи");
            String number = scan.nextLine();
            switch (number) {
                case "1" -> ex1();
                case "2" -> ex2();
                case "3" -> ex3();
                default -> maintain = 0;

            }
        } while (maintain != 0);
    }

    private static void ex1() {
        System.out.println("""
                            Задача 1.
                            Задать одномерный массив и найти в нем минимальный и максимальный элементы
                           """);
        Random random = new Random();

        // Создаем массив
        int[] nums = new int[random.nextInt(5, 10)];
        System.out.println("Создан массив: \n");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 11);
            System.out.printf(nums[i] + " ");
        }
        System.out.println();

        //Ищем максимум like a newbie
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }

        //Выводим ответ
        System.out.printf("В текущем массиве максимальное число равно %d, а минимальное равно %d", max, min);

    }

    private static void ex2() {
        System.out.println("""
                              Задача 2.
                              Написать метод, который определяет, является ли введенный пользователем год високосным,\s
                              и возвращает в консоль boolean (високосный - true, не високосный - false).""");

        // Принимаем год и парсим в инт
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        String year = scan.nextLine();
        int numYear = Integer.parseInt(year);
        boolean answer;

        // Если нет, то проверяем делимость на 400
        if (numYear % 100 != 0) {        // Проверяем есть ли у года десятки и единицы.
            // Если есть, то все в порядке, проверяем делимость на 4
            answer = numYear % 4 == 0;
        } else answer = numYear % 400 == 0;               // Делится -> true

        System.out.println(answer);
    }

    private static void ex3() {
        System.out.println("""
                           Задача 3. Дан массив nums = [3,2,2,3] и число val = 3.
                           Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.\s
                           """);

        Random random = new Random();

        // Создаем массив
        int[] nums = new int[random.nextInt(5, 10)];
        System.out.println("Создан массив: \n");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 4);
            System.out.printf(nums[i] + " ");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите искомое число");
        String val = scan.nextLine();

        int numVal = Integer.parseInt(val);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            if (nums[leftIndex] == numVal & nums[rightIndex] != numVal) {
                int c = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = c;
                leftIndex++;
                rightIndex--;
            } else if (nums[leftIndex] != numVal) {
                leftIndex++;
            } else if (nums[rightIndex] == numVal) {
                rightIndex--;
            }
        }

        // Выводим получившийся массив
        for (int num : nums) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }
}