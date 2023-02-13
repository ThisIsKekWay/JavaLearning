package Homeworks.HW7.Ex2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat  extends Space{
    private String name;
    private int mood;

    public Cat(String name, int mood, int position) {
        super(position);
        this.name = name;
        this.mood = mood;
    }

    public void showInfo(){
        System.out.println("Имя котика: " + this.name);
        System.out.println("Настроение котика: " + this.mood);
        System.out.println("Позиция котика: " + this.position);
    }
}
