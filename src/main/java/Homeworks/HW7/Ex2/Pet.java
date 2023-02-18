package Homeworks.HW7.Ex2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet extends Space implements Movable, Animal {
    private String name;
    private String type;
    private int mood;

    public Pet(String type, String name, int mood, int position) {
        super(position);
        this.name = name;
        this.mood = mood;
        this.type = type;
    }

    public void showInfo() {
        System.out.println("Вид питомца: " + this.type);
        System.out.println("Имя питомца: " + this.name);
        System.out.println("Настроение питомца: " + this.mood);
        System.out.println("Позиция питомца: " + this.position);
    }

    public static void pet(Owner owner, Pet pet) {
        int gap = Math.abs(owner.getPosition() - pet.getPosition());
        if (gap < 10) {
            System.out.printf("Пытаемся погладить котика по имени %s\n", pet.getName());
            if (pet.getMood() == 0) {
                System.out.printf("%s яростно хватает %s за руку и делает КУСЬ!\n", pet.getName(), owner.getName());
            } else {
                System.out.printf("%s дает %s себя погладить и мурлычет\n", pet.getName(), owner.getName());
            }
        } else {
            System.out.printf("%s слишком далеко от %s. Возможно, стоит его подозвать?\n", pet.getName(), owner.getName());
        }
    }

    public static void call(Owner owner, Pet pet) {
        int gap = owner.getPosition() - pet.getPosition();
        System.out.println("Кис-кис-кис");
        if (Math.abs(gap) > 50){
            System.out.printf("%s не слышит %s!\n", pet.getName(), owner.getName());
        } else {
            if (pet.getMood() == 0){
                System.out.printf("Котик еле тащится на встречу к %s\n", owner.getName());
                Pet.step(pet,owner);
            } else {
                System.out.printf("Котик радостно бежит прямо к %s\n", owner.getName());
                Pet.step(pet,owner);
            }
        }
    }

    public static void step(Pet pet, Owner owner) {
        int gap = pet.getPosition() - owner.getPosition();
        if (pet.mood == 0) {
            pet.setPosition(pet.getPosition() - gap / 6);
        } else {
            pet.setPosition(pet.getPosition() - gap / 3);
        }
    }
}