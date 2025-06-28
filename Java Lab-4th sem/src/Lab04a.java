import java.util.Scanner;
public class Lab04a {
    public enum DayofWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        public boolean isWorkday() {
            return(this != SUNDAY && this != SATURDAY);
        }
    }
    public static void main(String[] args) {
        System.out.println("Is Monday a workday:" + DayofWeek.MONDAY.isWorkday());
        System.out.println("Is Saturday a workday:" + DayofWeek.SATURDAY.isWorkday());
    }
}
