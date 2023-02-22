package Homeworks.HW9;

import java.util.Date;

public class Task<T> implements Printer{
    private int id;
    private Date dateOfCreating;
    private T priority;
    private Date deadline;
    private String author;


    public Task(int id,Date dateOfCreating ,T priority, Date deadline, String author) {
        this.id = id;
        this.dateOfCreating = dateOfCreating;
        this.priority = priority;
        this.deadline = deadline;
        this.author = author;
    }

    public T getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "id: %d, DoC: %s, Priority: %s, DL: %s, Author: %s".formatted(
                this.id,
                this.dateOfCreating,
                this.priority,
                this.deadline,
                this.author);
    }
}
