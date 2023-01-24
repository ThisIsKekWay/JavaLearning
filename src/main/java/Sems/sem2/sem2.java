package Sems.sem2;

import java.util.Scanner;

public class sem2 {
    public static void main(String[] args) {
        //ex1();
        //ex2();

    }

    private static void ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для сжатия");
        String string1 = scan.next();
        char[] ch;
        ch = string1.toCharArray();
        StringBuilder builder = new StringBuilder();

        System.out.println();
        int counter = 1;
        char current = 0;
        char prev;
        for (int i = 1; i < ch.length; i++){
            current = ch[i];
            prev = ch[i - 1];
            if( current == prev){
                counter++;
            } else {
                if (counter == 1){
                    builder.append(prev);
                } else {
                    builder.append(prev).append(counter);
                    counter = 1;
                }
            }
        }
        if (counter == 1){
            builder.append(current);
        } else {
            builder.append(current).append(counter);
        }
        System.out.println(builder);
    }

    private static void ex1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую символ строки");
        String string1 = scan.nextLine();
        System.out.println("Введите вторую символ строки");
        String string2 = scan.nextLine();
        System.out.println("Длинна финальной строки");
        int repeat = scan.nextInt();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; builder.length() < repeat; i++){
            builder.append(string1).append(string2);
        }

        if (repeat % 2 == 1){
            builder.delete(builder.length() - 1, builder.length());
        }

        System.out.println(builder);
    }
}
