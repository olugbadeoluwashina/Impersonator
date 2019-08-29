package check;

import library.Reminder;
import library.ReminderManager;
import library.ReminderWatcher;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReminderWatcherTest {

    private List<Reminder> originList;

    @Test
    public void canSortReminders() {

    }

    @Test
    public void sortedArraysSizeUnchanged() {

        //given
        Reminder reminder1 = new Reminder("ddd","desc","date", 2);
        Reminder reminder2 = new Reminder("ddd","desc","date", 2);
        ReminderWatcher rw = new ReminderWatcher();
        ReminderManager rm = new ReminderManager();

        rm.addReminder(reminder1);
        rm.addReminder(reminder2);

        //when
        originList = rm.getReminders();

        //then
        assertEquals(2, rw.sortReminders(originList).size());
    }
}