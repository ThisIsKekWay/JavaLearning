package Homeworks.HW6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Laptop {
    private int serialNumber;
    private int price;
    private int ramGb;
    private boolean gaming;
    private String color;
    private String display;


    public Laptop(int serialNumber, int price, int ramGb, boolean gaming, String color, String display) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.ramGb = ramGb;
        this.gaming = gaming;
        this.color = color;
        this.display = display;
    }

    public void getInfo() {
        System.out.println("Серийный номер:" + this.serialNumber);
        System.out.println("Цена:" + this.price);
        System.out.println("Объем оперативной памяти:" + this.ramGb);
        System.out.println("Игровой:" + this.gaming);
        System.out.println("Цвет:" + this.color);
        System.out.println("Тип дисплея:" + this.display);
    }
}