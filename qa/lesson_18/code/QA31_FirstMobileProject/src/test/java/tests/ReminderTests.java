package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        app.getMainScreen().confirm();
    }

    @Test
    public void addReminderPositiveTest() {
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //enter reminder title
        app.getReminder().enterTitleOfReminder("Holiday");
        //select date, month, year
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future",2,"MAY");
        app.getReminder().selectDate(0);
        app.getReminder().selectYear("future","2025");
        app.getReminder().tapOnOk();
        //select time
        //select repetition interval
        //scroll
        //select type of repetition
        //assert reminder is added
    }
}
