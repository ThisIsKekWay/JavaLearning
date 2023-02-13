package Homeworks.HW7.Ex2;


public class Relations {
    public void call(Owner o1, Cat c1){
        int gap = o1.getPosition() - c1.getPosition();
        System.out.println("Кис-кис-кис");
        if (Math.abs(gap) > 50){
            System.out.printf("%s не слышит %s!\n", c1.getName(), o1.getName());
        } else {
            if (c1.getMood() == 0){
                System.out.printf("Котик еле тащится на встречу к %s\n", o1.getName());
                step(c1,o1);
            } else {
                System.out.printf("Котик радостно бежит прямо к %s\n", o1.getName());
                step(c1,o1);
            }
        }
    }

    public void Pet(Owner o1, Cat c1){
        int gap = Math.abs(o1.getPosition() - c1.getPosition());
        if(gap < 10) {
            System.out.printf("Пытаемся погладить котика по имени %s\n", c1.getName());
            if (c1.getMood() == 0) {
                System.out.printf("%s яростно хватает %s за руку и делает КУСЬ!\n", c1.getName(), o1.getName());
            } else {
                System.out.printf("%s дает %s себя погладить и мурлычет\n", c1.getName(), o1.getName());
            }
        } else {
            System.out.printf("%s слишком далеко от %s. Возможно, стоит его подозвать?\n", c1.getName(), o1.getName());
        }
    }

    public void step(Space being1, Space being2){
        int gap = being1.getPosition() - being2.getPosition();
        if (gap > 0) {
            being1.setPosition(being1.getPosition() - gap / 5);
        } else {
            being1.setPosition(being1.getPosition() - gap / 5);
        }
    }
}

