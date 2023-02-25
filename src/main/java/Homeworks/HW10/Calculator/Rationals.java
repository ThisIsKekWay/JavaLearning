package Homeworks.HW10.Calculator;

public class Rationals implements Model, NODNOK{
    private int numerator;
    private int denominator;

    public Rationals(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        int wholePart = numerator / denominator;
        if(wholePart != 0){
            numerator = numerator - denominator * wholePart;
            if(numerator == 0){
                return "%d".formatted(wholePart);
            }

            return "%d %d/%d".formatted(wholePart, Math.abs(numerator), Math.abs(denominator));
        } else {
            if (numerator < 0 | denominator < 0){
                return "-%d/%d".formatted( Math.abs(numerator), Math.abs(denominator));
            } else {
                return "%d/%d".formatted(Math.abs(numerator), Math.abs(denominator));
            }
        }
    }

    @Override
    public Object sum(Object t1, Object t2) {
        Rationals r1 = (Rationals) t1;
        Rationals r2 = (Rationals) t2;
        int nok = lcm(r1.denominator, r2.denominator);
        r1.numerator = r1.numerator * (nok / r1.denominator);
        r2.numerator = r2.numerator * (nok / r2.denominator);
        return new Rationals(r1.numerator + r2.numerator, nok);
    }

    @Override
    public Object diff(Object t1, Object t2) {
        Rationals r1 = (Rationals) t1;
        Rationals r2 = (Rationals) t2;
        int nok = lcm(r1.denominator, r2.denominator);
        r1.numerator = r1.numerator * (nok / r1.denominator);
        r2.numerator = r2.numerator * (nok / r2.denominator);
        return new Rationals(r1.numerator - r2.numerator, nok);
    }

    @Override
    public Object div(Object t1, Object t2) {
        Rationals r1 = (Rationals) t1;
        Rationals r2 = (Rationals) t2;
        return new Rationals(r1.numerator * r2.denominator, r1.denominator * r2.numerator );
    }

    @Override
    public Object mult(Object t1, Object t2) {
        Rationals r1 = (Rationals) t1;
        Rationals r2 = (Rationals) t2;
        return new Rationals(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
    }
}
