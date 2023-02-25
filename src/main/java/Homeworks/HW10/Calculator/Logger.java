package Homeworks.HW10.Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void log(String string){
        Date current = new Date();
        try (FileWriter fw = new FileWriter("src/main/java/Homeworks/HW10/Calculator/CalcLog.csv", true)){
            StringBuilder sb = new StringBuilder("%s: %s \n".formatted(current, string));
            fw.append(sb);
            fw.flush();
            System.out.println(sb);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
