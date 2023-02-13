package Homeworks.HW7.Ex2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Owner extends Space{
    private String name;

    public Owner(String name, int position) {
        super(position);
        this.name = name;
    }

    public void showInfo(){
        System.out.println("Имя хозяина: " + this.name);
        System.out.println("Позиция хозяина: " + this.position);
    }
}
