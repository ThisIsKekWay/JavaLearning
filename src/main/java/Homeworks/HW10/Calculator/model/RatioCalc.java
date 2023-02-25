package Homeworks.HW10.Calculator.model;

import Homeworks.HW10.Calculator.Logger;

public class RatioCalc extends SetNum implements Model<Rationals>{

    @Override
    public Rationals sum(Rationals t1, Rationals t2) {
        Rationals res = new Rationals(t1.real + t2.real);
        Logger.log("%s + %s = %s".formatted(t1, t2, res));
        return res;
    }

    @Override
    public Rationals diff(Rationals t1, Rationals t2) {
        Rationals res = new Rationals(t1.real - t2.real);
        Logger.log("%s - %s = %s".formatted(t1, t2, res));
        return res;
    }

    @Override
    public Rationals div(Rationals t1, Rationals t2) {
        Rationals res = new Rationals(t1.real / t2.real);
        Logger.log("%s / %s = %s".formatted(t1, t2, res));
        return res;
    }

    @Override
    public Rationals mult(Rationals t1, Rationals t2) {
        Rationals res = new Rationals(t1.real * t2.real);
        Logger.log("%s * %s = %s".formatted(t1, t2, res));
        return res;
    }
}
