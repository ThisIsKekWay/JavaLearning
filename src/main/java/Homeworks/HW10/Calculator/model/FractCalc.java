package Homeworks.HW10.Calculator.model;


import Homeworks.HW10.Calculator.Logger;

public class FractCalc implements Model<Fractionals>, NodNok {
    @Override
    public Fractionals sum(Fractionals r1, Fractionals r2){
        int nok = lcm(r1.denominator, r2.denominator);
        r1.numerator = r1.numerator * (nok / r1.denominator);
        r2.numerator = r2.numerator * (nok / r2.denominator);
        Fractionals res = new Fractionals(r1.numerator + r2.numerator, nok);
        Logger.log("%s + %s = %s\n".formatted(r1, r2, res));
        return res;
    }

    @Override
    public Fractionals diff(Fractionals r1, Fractionals r2) {
        int nok = lcm(r1.denominator, r2.denominator);
        r1.numerator = r1.numerator * (nok / r1.denominator);
        r2.numerator = r2.numerator * (nok / r2.denominator);
        Fractionals res = new Fractionals(r1.numerator - r2.numerator, nok);
        Logger.log("%s - %s = %s\n".formatted(r1, r2, res));
        return res;
    }

    @Override
    public Fractionals div(Fractionals r1, Fractionals r2) {
        Fractionals res = new Fractionals(r1.numerator * r2.denominator, r1.denominator * r2.numerator );
        Logger.log("%s / %s = %s\n".formatted(r1, r2, res));
        return res;
    }

    @Override
    public Fractionals mult(Fractionals r1, Fractionals r2) {
        Fractionals res = new Fractionals(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
        Logger.log("%s * %s = %s\n".formatted(r1, r2, res));
        return res;
    }
}
