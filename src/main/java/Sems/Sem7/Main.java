package Sems.Sem7;

public class Main {
    public static void main(String[] args) {
        SmallHead smallHead = new SmallHead();
        Body body = new Body();

        Robot<SmallHead> robot = new Robot<>(smallHead, body);
        robot.getHead().voice();
    }
}

