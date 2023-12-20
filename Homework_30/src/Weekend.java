public enum Weekend {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public  boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }

}
