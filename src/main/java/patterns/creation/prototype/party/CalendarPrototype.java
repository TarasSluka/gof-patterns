package patterns.creation.prototype.party;

public class CalendarPrototype implements Cloneable {

    @Override
    public CalendarPrototype clone() throws CloneNotSupportedException {
        return (CalendarPrototype) super.clone();
    }
}
