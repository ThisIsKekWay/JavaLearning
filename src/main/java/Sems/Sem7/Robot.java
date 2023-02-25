package Sems.Sem7;

public class Robot<T> {
    private T head;
    private Body body;

    public Robot(T head, Body body) {
        this.head = head;
        this.body = body;
    }

    public T getHead() {
        return head;
    }
}
