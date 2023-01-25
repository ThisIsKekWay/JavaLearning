package Homeworks.HW2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class HW2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    Список задач:
                    1) Напишите метод, который принимает на вход строку (String) и определяет является ли\s
                    строка палиндромом (возвращает boolean значение).
                                    
                    2) Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,\s
                    который запишет эту строку в простой текстовый файл, обработайте исключения.
                                        
                    Для выхода введите любое незначащее число
                    """);

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер задачи");
            String number = scan.nextLine();
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
                                           
                           Напишите метод, который принимает на вход строку (String) и определяет является ли\s
                           строка палиндромом (возвращает boolean значение).
                           """);

        boolean answer = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки: \n");
        String check = scan.next();

        for (int i = 0; i < check.length() / 2; i++) {
            if (check.charAt(i) != check.charAt(check.length() - 1 - i)) {
                answer = false;
                break;
            }
        }

        System.out.println(answer);
    }



    private static void ex2() {
        System.out.println("""
                Задача 2.
                                           
                Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,\s
                который запишет эту строку в простой текстовый файл, обработайте исключения.
                """);

        createFile();
        writeFile();
    }

    private static void writeFile() {
        String testString = "TEST".repeat(100);
        try (PrintWriter pw = new PrintWriter("src/main/java/Homeworks/HW2/text.txt")){
            pw.write(testString);
            pw.close();
            System.out.println("Запись добавлена");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Запись не работает");
        }
    }

    private static void createFile() {
        File file = new File("src/main/java/Homeworks/HW2/text.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (Exception e){
            System.out.println("Создание файла не работает");
        }
    }


}

