package Homeworks.HW10.Calculator;

public class Complex implements Model{
    private final double real;
    private final double imagine;

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


    @Override
    public Object sum(Object t1, Object t2) {
        Complex c1 = (Complex) t1;
        Complex c2 = (Complex) t2;
        return new Complex(c1.real + c2.real, c1.imagine + c2.imagine);
    }

    @Override
    public Object diff(Object t1, Object t2) {
        Complex c1 = (Complex) t1;
        Complex c2 = (Complex) t2;
        return new Complex(c1.real - c2.real, c1.imagine - c2.imagine);
    }

    @Override
    public Object div(Object t1, Object t2) {
        Complex c1 = (Complex) t1;
        Complex c2 = (Complex) t2;
        double denom = Math.pow(c2.real, 2) + Math.pow(c2.imagine, 2);
        double resReal = (c1.real * c2.real + c1.imagine * c2.imagine) / denom;
        double resImg = (c1.imagine * c2.real + c1.real * c2.imagine) / denom;
        return new Complex(resReal, resImg);
    }

    @Override
    public Object mult(Object t1, Object t2) {
        Complex c1 = (Complex) t1;
        Complex c2 = (Complex) t2;
        double resReal = c1.real * c2.real - c1.imagine * c2.imagine;
        double resImg = c1.imagine * c2.real + c1.real * c2.imagine;
        return new Complex(resReal, resImg);
    }
}
