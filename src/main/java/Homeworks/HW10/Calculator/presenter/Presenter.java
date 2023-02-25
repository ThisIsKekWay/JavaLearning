package Homeworks.HW10.Calculator.presenter;

import Homeworks.HW10.Calculator.model.*;
import Homeworks.HW10.Calculator.view.View;

public class Presenter{
    View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void buttonClick(){
        while(true){
            view.greeting();
            String order = view.getValue("Команда: ");

            ComplexCalc var1 = new ComplexCalc();
            RatioCalc var2 = new RatioCalc();
            FractCalc var3 = new FractCalc();


            switch (order) {
                case "1" -> {
                    String[] a = view.getValue("Введите мнимую и действительную часть числа №1 через пробел: ").split(" ");
                    Complex c1 = new Complex(Double.parseDouble(a[0]), Double.parseDouble(a[1]));
                    a = view.getValue("Введите мнимую и действительную часть числа №2 через пробел: ").split(" ");
                    Complex c2 = new Complex(Double.parseDouble(a[0]), Double.parseDouble(a[1]));

                    view.operation();
                    order = view.getValue("Команда: ");
                    switch (order) {
                        case "1" -> var1.sum(c1, c2);
                        case "2" -> var1.diff(c1, c2);
                        case "3" -> var1.mult(c1, c2);
                        case "4" -> var1.div(c1, c2);
                    }
                }
                case "2" -> {
                    String[] a = view.getValue("Введите два рациональных числа через пробел: ").split(" ");
                    Rationals c1 = new Rationals(Double.parseDouble(a[0]));
                    Rationals c2 = new Rationals(Double.parseDouble(a[1]));

                    view.operation();
                    order = view.getValue("Команда: ");
                    switch (order) {
                        case "1" -> var2.sum(c1, c2);
                        case "2" -> var2.diff(c1, c2);
                        case "3" -> var2.mult(c1, c2);
                        case "4" -> var2.div(c1, c2);
                    }
                }
                case "3" -> {
                    String[] a = view.getValue("Введите числитель и знаменатель числа №1 через пробел: ").split(" ");
                    Fractionals c1 = new Fractionals(Integer.parseInt(a[0]), Integer.parseInt(a[1]));
                    a = view.getValue("Введите числитель и знаменатель числа №2 через пробел: ").split(" ");
                    Fractionals c2 = new Fractionals(Integer.parseInt(a[0]), Integer.parseInt(a[1]));

                    view.operation();
                    order = view.getValue("Команда: ");
                    switch (order) {
                        case "1" -> var3.sum(c1, c2);
                        case "2" -> var3.diff(c1, c2);
                        case "3" -> var3.mult(c1, c2);
                        case "4" -> var3.div(c1, c2);
                    }
                }
                case "0" -> System.exit(0);
            }
        }
    }
}

