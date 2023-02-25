package Homeworks.HW10.Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void log(String string) throws IOException {
        Date current = new Date();
        FileWriter fw = new FileWriter("CalcLog.csv", true);
        StringBuilder sb = new StringBuilder("%s: %s \n".formatted(current, string));
        fw.append(sb);
        fw.flush();
    }
}
