package Homeworks.HW10.Calculator.model;

import Homeworks.HW10.Calculator.Logger;

public class ComplexCalc extends SetNum implements Model<Complex> {

    @Override
    public Complex sum(Complex c1, Complex c2) {
        Complex res = new Complex(c1.real + c2.real, c1.imagine + c2.imagine);
        Logger.log("%s + %s = %s\n".formatted(c1, c2, res));
        return res;
    }

    @Override
    public Complex diff(Complex c1, Complex c2) {
        Complex res = new Complex(c1.real - c2.real, c1.imagine - c2.imagine);
        Logger.log("%s - %s = %s\n".formatted(c1, c2, res));
        return res;
    }

    @Override
    public Complex div(Complex c1, Complex c2) {
        double denom = Math.pow(c2.real, 2) + Math.pow(c2.imagine, 2);
        double resReal = (c1.real * c2.real + c1.imagine * c2.imagine) / denom;
        double resImg = (c1.imagine * c2.real - c1.real * c2.imagine) / denom;
        Complex res = new Complex(resReal, resImg);
        Logger.log("%s / %s = %s\n".formatted(c1, c2, res));
        return res;
    }

    @Override
    public Complex mult(Complex c1, Complex c2) {
        double resReal = c1.real * c2.real - c1.imagine * c2.imagine;
        double resImg = c1.imagine * c2.real + c1.real * c2.imagine;
        Complex res = new Complex(resReal, resImg);
        Logger.log("%s * %s = %s\n".formatted(c1, c2, res));
        return res;
    }
}
