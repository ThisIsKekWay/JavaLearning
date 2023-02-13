package Homeworks.HW7;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human {
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
}


