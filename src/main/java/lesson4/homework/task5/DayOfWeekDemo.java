package lesson4.homework.task5;

public class DayOfWeekDemo {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;
        DayOfWeek weekendDay = DayOfWeek.SATURDAY;
        DayOfWeek weekday = DayOfWeek.MONDAY;

        System.out.println("Today is: " + today);
        System.out.println("Weekend day is: " + weekendDay);
        System.out.println("Weekday is: " + weekday);

        System.out.println(today + " is a weekend: " + today.isWeekend());
        System.out.println(weekendDay + " is a weekend: " + weekendDay.isWeekend());
        System.out.println(weekday + " is a weekend: " + weekday.isWeekend());
    }
}
