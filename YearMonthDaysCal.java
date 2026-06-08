
import java.util.*;

class YearMonthDaysCal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Total Days: ");
        int totalDays = scan.nextInt();

        int year;

        year = totalDays / 365;

        int reminingDays;
        reminingDays = totalDays % 365;

        int month;

        month = reminingDays / 30;

        reminingDays = reminingDays % 30;

        int days = reminingDays;

        System.out.println("--------------------------------------------------");
        System.out.println("Year= " + year);
        System.out.println("Month= " + month);
        System.out.println("Days= " + days);
        System.out.println("--------------------------------------------------");

    }
}
