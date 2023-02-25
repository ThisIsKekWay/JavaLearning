package Homeworks.HW10.Calculator.model;

public class Fractionals {
    protected int numerator;
    protected int denominator;
    protected int wholePart;

    public Fractionals(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        wholePart = numerator / denominator;
        if(wholePart != 0){
            int newNumerator = numerator % denominator;
            if(numerator == 0){
                return "%d".formatted(wholePart);
            }

            return "%d %d/%d".formatted(wholePart, newNumerator, denominator);
        } else {
            if (numerator < 0 | denominator < 0){
                return "-%d/%d".formatted( Math.abs(numerator), Math.abs(denominator));
            } else {
                return "%d/%d".formatted(Math.abs(numerator), Math.abs(denominator));
            }
        }
    }
}
