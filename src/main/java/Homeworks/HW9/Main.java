package Homeworks.HW9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Task> lst = new ArrayList<>();
        LowPriority lp = new LowPriority();
        NormalPriority np = new NormalPriority();
        HighPriority hp = new HighPriority();

        Task<LowPriority> task1 = new Task<>(1, new Date(), lp, new Date(1999999999999L), "Koha");
        lst.add(task1);

        Task<NormalPriority> task2 = new Task<>(2, new Date(), np, new Date(1999998999999L), "Koha");
        lst.add(task2);

        Task<HighPriority> task3 = new Task<>(3, new Date(), hp, new Date(1999999999999L), "Koha");
        lst.add(task3);

        for (Task tsk: lst) {
            System.out.println(tsk);
            System.out.println();
            tsk.print(tsk);
        }
    }
}

