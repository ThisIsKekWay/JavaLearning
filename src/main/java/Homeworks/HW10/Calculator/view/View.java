package Homeworks.HW10.Calculator.view;

import java.util.Scanner;

public class View {

    Scanner in = new Scanner(System.in);

    public String getValue(String title) {
        System.out.printf("%s", title);
        return in.nextLine();
    }

    public void greeting() {
        System.out.println("""
                           Запущен калькулятор.
                           Введите номер команды для выполнения.
                           1) Вычисление комплексных чисел.
                           2) Вычисление рациональных чисел.
                           3) Вычисление натуральных дробей.
                           
                           Введите 0 для закрытия программы.
                           """);
    }

    public void operation() {
        System.out.println("""
                           Введите номер операции для выполнения
                           1) +
                           2) -
                           3) *
                           4) /
                           """);
    }
}
