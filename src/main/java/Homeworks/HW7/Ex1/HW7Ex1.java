package Homeworks.HW7.Ex1;

import java.util.Random;
public class HW7Ex1 {
        static Human h1;
        static Human h2;
        static Human h3;

    public static void main(String[] args) {
        Random rng = new Random();

        h1 = new Human("Леонид",  rng.nextInt(0, 100));
        h2 = new Human("Светлана",  rng.nextInt(0, 100));
        h3 = new Human("Кирилл",  rng.nextInt(0, 100));
        h1.showInfo();
        h2.showInfo();
        h3.showInfo();
        
        Human.showRelations(h1, h2);
        Human.showRelations(h1, h3);
        Human.showRelations(h2, h1);
        Human.showRelations(h2, h3);
        Human.showRelations(h3, h1);
        Human.showRelations(h3, h2);
    }
}
