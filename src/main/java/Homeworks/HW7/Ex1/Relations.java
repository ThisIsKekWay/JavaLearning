package Homeworks.HW7.Ex1;

public class Relations implements Tree{

    @Override
    public void showRelations(Human h1, Human h2) {
        int ageGap = h1.getAge() - h2.getAge();
        if(ageGap >= 18){
            h1.setStatus("предок");
            h2.setStatus("потомок");
        } else if (ageGap <= -18) {
            h1.setStatus("потомок");
            h2.setStatus("предок");
        } else {
            h1.setStatus("в одном поколении с");
            h2.setStatus("в одном поколении с");
        }

        System.out.printf("%s %s %s\n", h1, h1.getStatus(), h2);
    }
}
