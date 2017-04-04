package patterns.creation.prototype;

import patterns.creation.prototype.party.CalendarEvent;
import patterns.creation.prototype.party.Person;
import patterns.creation.prototype.party.Priority;

import java.util.Date;

public class RunParty {

    public static CalendarEvent getExistingEvent() {
        CalendarEvent calendarEvent = new CalendarEvent();
        Person person1 = new Person("f_name_1", "l_name_1");
        Person person2 = new Person("f_name_2", "l_name_2");
        Person person3 = new Person("f_name_3", "l_name_3");
        calendarEvent.setAttendees(new Person[]{person1, person2, person3});
        calendarEvent.setDateTime(new Date());
        calendarEvent.setPriority(Priority.HiGH);
        return calendarEvent;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CalendarEvent event = getExistingEvent();
        CalendarEvent nextEvent = (CalendarEvent) event.clone();
        nextEvent.setPriority(Priority.LOV);
        System.out.println("event      " + event.toString());
        System.out.println("next event " + nextEvent.toString());
    }
}
