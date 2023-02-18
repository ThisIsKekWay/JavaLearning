package Sems.sem3;

import java.util.ArrayList;

public class sem3 {
    public static void main(String[] args) {
        // Тип OBJECT - может быть всем, чем угодно.
        // Любое значение любого типа может быть помещено в OBJECT и вынуто обратно.
        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2809);
        list.add(2810);

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
