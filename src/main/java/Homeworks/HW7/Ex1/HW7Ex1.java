package Homeworks.HW7.Ex1;

import java.io.IOException;
import java.util.Random;
public class HW7Ex1 {
    public static void main(String[] args) throws IOException {
        Random rng = new Random();

        Human h1 = new Human("Леонид",  rng.nextInt(0, 100));
        Human h2  = new Human("Светлана",  rng.nextInt(0, 100));
        Human h3 = new Human("Кирилл",  rng.nextInt(0, 100));
        h1.showInfo();
        h2.showInfo();
        h3.showInfo();

        Relations var = new Relations();
        
        var.showRelations(h1, h2);
        var.showRelations(h1, h3);
        var.showRelations(h2, h3);
        var.showRelations(h2, h1);
        var.showRelations(h3, h1);
        var.showRelations(h3, h2);
        var.print(h1, h2);
        var.print(h1, h3);
        var.print(h2, h1);
        var.print(h2, h3);
        var.print(h3, h1);
        var.print(h3, h2);
    }
}
