package Homeworks.HW7.Ex1;

import java.io.FileWriter;
import java.io.IOException;

public interface Printer {
    default void print(Human h1, Human h2) throws IOException {
        FileWriter fw = new FileWriter("info.txt", true);
        fw.write("%s %s %s\n".formatted(h1, h1.getStatus(), h2));
        fw.write("-----\n");
        fw.flush();
    }
}
