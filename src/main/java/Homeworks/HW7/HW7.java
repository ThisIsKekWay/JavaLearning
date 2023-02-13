package Homeworks.HW7;

import java.util.Random;
public class HW7 {
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

        Realtions var = new Realtions();
        var.showRelations(h1, h2);
        var.showRelations(h1, h3);
        var.showRelations(h2, h1);
        var.showRelations(h2, h3);
        var.showRelations(h3, h1);
        var.showRelations(h3, h2);
    }
}
