package Homeworks.HW10.Calculator.model;

public class Complex extends SetNum{
    public Complex(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public String toString() {
        if(real == 0 & imagine == 0){
            return "0";
        } else if (real == 0) {
            return "%.2fj".formatted(imagine);
        } else if (imagine == 0) {
            return "%.2f".formatted(real);
        }

        if(imagine < 0){
            return "%.2f - %.2fj".formatted(real, Math.abs(imagine));
        } else {
            return "%.2f + %.2fj".formatted(real, imagine);
        }
    }
}
