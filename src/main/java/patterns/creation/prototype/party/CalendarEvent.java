package patterns.creation.prototype.party;

import lombok.Data;

import java.util.Date;

@Data
public class CalendarEvent extends CalendarPrototype {
    private Person[] attendees;
    private Priority priority = Priority.HiGH;
    private Date dateTime;

    @Override
    public CalendarEvent clone() throws CloneNotSupportedException {
        return (CalendarEvent) super.clone();
    }
}
