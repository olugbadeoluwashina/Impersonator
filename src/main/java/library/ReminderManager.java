package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReminderManager {

    private List<Reminder> reminders;
    private final String filename = "output.txt";

    public ReminderManager() {
        reminders = new ArrayList<Reminder>();
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);
    }

    public void deleteReminder(Reminder reminder) {
        reminders.remove(reminder);
    }

    public void changeReminder(Reminder newReminder, Reminder oldReminder) {
        if (newReminder.equals(oldReminder)) {

        }else {
            int i = reminders.indexOf(oldReminder);
            reminders.set(i, newReminder);
        }
    }

    public List getReminders() {
        return reminders;
    }

    //Using text
    protected void saveToFile() throws FileNotFoundException {
        PrintWriter output = new PrintWriter("output.txt");

        for (Reminder r : reminders) {
            output.println(r);
        }

        output.close();
    }

    public void readFromFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        String title, desc;
        int freq;
        Reminder reminder;
        input.useDelimiter(".");

        while (input.hasNextLine()) {
            title = input.nextLine();
            desc = input.nextLine();
            freq = Integer.parseInt(input.nextLine());
            input.nextLine();

            reminder = new Reminder(title, desc, "", freq);
            addReminder(reminder);
        }

        input.close();
    }
}
