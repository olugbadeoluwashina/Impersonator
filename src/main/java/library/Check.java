package library;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Check {

    public static void main(String[] args) {
        Reminder one = new Reminder("dcd", "sdsds", "ddd", 1);
        Reminder two = new Reminder("dcd", "sdsds", "ddd", 2);

        ReminderManager rm = new ReminderManager();

        try {
            rm.readFromFile();
        }catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }

        List<Reminder> list = rm.getReminders();
        for (Reminder r : list) {
            System.out.println(r);
        }

    }
}
