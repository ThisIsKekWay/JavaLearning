package Homeworks.HW7.Ex1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human implements Tree{
    private String name;
    private int age;
    private String status;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }


    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.status);
        System.out.println("-------------");
    }

    public static void showRelations(Human h1, Human h2){
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


