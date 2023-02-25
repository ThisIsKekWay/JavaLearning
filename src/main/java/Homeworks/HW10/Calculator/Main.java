package Homeworks.HW10.Calculator;

import Homeworks.HW10.Calculator.presenter.Presenter;
import Homeworks.HW10.Calculator.view.View;

public class Main{
    public static void main(String[] args){
        Presenter pr = new Presenter(new View());
        pr.buttonClick();

    }
}
