

public class DaysOfWeek {
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
    }

    public static String getWorkingHours(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return ("До конца рабочей недели осталось 40 часов");
            case TUESDAY:
                return ("До конца рабочей недели осталось 32 часов");

            case WEDNESDAY:
                return("До конца рабочей недели осталось 24 часов");

            case THURSDAY:
                return ("До конца рабочей недели осталось 16 часов");

            case FRIDAY:
                return ("До конца рабочей недели осталось 8 часов");

            case SATURDAY:
                return ("Сегодня выходной!");

            case SUNDAY:
                return ("Сегодня выходной!");
        }
        return null;
    }

}
