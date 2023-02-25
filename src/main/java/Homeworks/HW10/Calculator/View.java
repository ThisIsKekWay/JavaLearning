package Homeworks.HW10.Calculator;

import java.util.Scanner;

public class View<T> {
    Scanner in = new Scanner(System.in);

    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(T data, String title) {
        System.out.printf("%s %s\n", title, data);
    }
}
