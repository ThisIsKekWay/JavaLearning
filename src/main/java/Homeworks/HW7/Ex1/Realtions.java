package Homeworks.HW7.Ex1;


public class Realtions {
    public void showRelations(Human h1, Human h2){
        int ageGap = h1.getAge() - h2.getAge();
        if(ageGap >= 18){
            h1.setStatus("Родитель");
            h2.setStatus("Ребенок");
        } else if (ageGap <= -18) {
            h1.setStatus("Ребенок");
            h2.setStatus("Родитель");
        } else {
            h1.setStatus("Брат / сестра");
            h2.setStatus("Брат / сестра");
        }

        System.out.printf("%s %s %s\n", h1, h1.getStatus(), h2);

    }
}
