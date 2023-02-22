package Homeworks.HW9;

public class LowPriority extends Priority{
    public LowPriority(Object priority) {
        super(priority);
    }

    public LowPriority() {
    }

    @Override
    public String toString() {
        return "Low";
    }
}
