package patterns.creation.prototype.party;

public enum Priority {
    HiGH, LOV;


    public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) {
        return Enum.valueOf(enumType, name);
    }
}
