package Sems.Sem6;

import java.util.HashSet;
import java.util.Random;

public class Sem6 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] arr1 = new int[1000];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rng.nextInt(0, 1001);
        }

        HashSet<Integer> h1 = new HashSet<>();
        for (int elem: arr1) {
            System.out.printf("%d ", elem);
            h1.add(elem);
        }
        System.out.println();

        double percent = 0;
        percent = h1.size() * 0.1;
        System.out.println(percent);
    }
}
