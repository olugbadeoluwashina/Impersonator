package check;

import library.Reminder;
import library.ReminderManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class ReminderManagerTest {

    ReminderManager manager;
    Reminder reminder1, reminder2;
    List<Reminder> reminderList;

    @Test
    public void canAddReminders() {
        //given


        //when
        manager.addReminder(reminder1);
        manager.addReminder(reminder2);
        //then
        Assert.assertEquals(2, reminderList.size());
    }

    @Before
    public void createManager() {
        manager = new ReminderManager();

        reminder1 = new Reminder("ddd","desc","date", 2);
        reminder2 = new Reminder("ddd","desc","date", 2);

        reminderList = manager.getReminders();
    }

    @Test
    public void canAddRemindersFromFile() throws FileNotFoundException {
        manager.readFromFile();
    }

    @Test
    public void canDeleteReminder() {
        manager.deleteReminder(reminder1);
        Assert.assertEquals(1, reminderList.size());
    }

}
