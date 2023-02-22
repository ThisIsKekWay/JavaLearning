package Homeworks.HW9;

import java.io.*;

public interface Printer {
    default void print(Task tsk) throws IOException {
        FileWriter fw = new FileWriter("Tasks.csv", true);
        fw.write(tsk + "\n");
        fw.flush();
    }
}
