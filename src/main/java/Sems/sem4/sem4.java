package Sems.sem4;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class sem4 {
    public static void main(String[] args) {
        //ex0();
        ex1();
    }

    private static void ex1() {
        LinkedList<String> words = new LinkedList<>();
        while (true) {
            System.out.println("Введите команду:");
            Scanner scan = new Scanner(System.in);
            String command = scan.next();
            String[] splitedStr = command.split("~"); //[0] -> text , [1] -> num
            switch (splitedStr[0]) {
                case "print" -> {
                    System.out.println(words.get(Integer.parseInt(splitedStr[1]) - 1));
                    words.remove(Integer.parseInt(splitedStr[1]) - 1);
                    words.add((Integer.parseInt(splitedStr[1]) - 1), "");
                    System.out.println(words);
                }
                case "0" -> {
                    System.exit(0);
                }
                default -> {
                    if (Integer.parseInt(splitedStr[1]) > words.size()){
                        for (int i = words.size(); i <= Integer.parseInt(splitedStr[1]) - 1; i++) {
                            if (i == Integer.parseInt(splitedStr[1]) - 1){
                                words.add(Integer.parseInt(splitedStr[1]) - 1, splitedStr[0]);
                                break;
                            }
                            words.add("");
                        }
                    } else{
                        words.set(Integer.parseInt(splitedStr[1]) - 1, splitedStr[0]);
                    }


                    System.out.println(words);
                }
            }
        }
    }

//        private static void ex0 () {
//            final int SIZE = 1_000_000;
//            ArrayList<Random> arrayList = new ArrayList<>();
//            long start = System.currentTimeMillis();
//            for (int i = 0; i < SIZE; i++) {
//                arrayList.add(0, new Random());
//            }
//            System.out.println("Array List: " + (System.currentTimeMillis() - start));
//
//
//            LinkedList<Random> linkedList = new LinkedList<>();
//            start = System.currentTimeMillis();
//            for (int i = 0; i < SIZE; i++) {
//                linkedList.add(0, new Random());
//            }
//            System.out.println("Linked List: " + (System.currentTimeMillis() - start));
//        }
}
