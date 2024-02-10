import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        // Create a Calendar object
        Calendar calendar = Calendar.getInstance();

        // Get the current date
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Print the current date
        System.out.println("The current date is: " + year + "-" + month + "-" + day);

        // Get the number of days in the current month
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Print the number of days in the current month
        System.out.println("The number of days in the current month is: " + daysInMonth);

        // Print the calendar
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.println(i);
        }
    }
}