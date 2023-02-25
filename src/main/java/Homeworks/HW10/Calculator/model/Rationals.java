package Homeworks.HW10.Calculator.model;

public class Rationals extends SetNum{
    public Rationals(double real){
        this.real = real;
    }

    @Override
    public String toString() {
        return "%.2f".formatted(real);
    }
}
