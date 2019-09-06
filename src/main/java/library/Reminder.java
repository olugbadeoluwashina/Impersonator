package library;

import java.text.DateFormat;
import java.util.Calendar;

public class Reminder {

    private String title;
    private String description;
    private Calendar date;
    private int frequency;

    public Reminder(String title, String description, String date, int frequency) {
        this.title = title;
        this.description = description;
        date = date;

        setFrequency(frequency);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setFrequency(int frequency) {

        Frequency frequency1 = new Frequency();
        this.frequency = frequency1.isValid(frequency)? frequency : 1;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return new String(title+"\n"+description+"\n"+frequency+"\n");
    }

    class Frequency {
        final int ONCE = 1;
        final int DAILY = 2;
        final int WEEKLY = 3;
        final int MONTHLY = 4;

        boolean isValid(int freq) {
            if (freq == ONCE | freq == DAILY | freq == WEEKLY | freq == MONTHLY)
                return true;
            else
                return false;
        }

    }

}
