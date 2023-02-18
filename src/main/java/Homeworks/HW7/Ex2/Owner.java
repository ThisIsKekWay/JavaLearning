package Homeworks.HW7.Ex2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner extends Space implements Movable{
    private String name;

    public Owner(String name, int position) {
        super(position);
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Имя хозяина: " + this.name);
        System.out.println("Позиция хозяина: " + this.position);
    }

    @Override
    public void step(Space being1, Space being2) {
        int gap = being1.getPosition() - being2.getPosition();
        being1.setPosition(being1.getPosition() - gap / 2);
    }
}
