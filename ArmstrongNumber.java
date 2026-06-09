
import java.util.*;

class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = scan.nextInt();

        int reminder = 0;
        int armstrongNumber = 0;
        int cubeOfReminder = 0;

        while (num != 0) {
            reminder = num % 10;
            num = num / 10;
            cubeOfReminder = reminder * reminder * reminder;
            armstrongNumber = cubeOfReminder + armstrongNumber;
        }
        if (armstrongNumber == num) {
            System.out.println("Armstrong Number: " + armstrongNumber);
        } else {
            System.out.println("This Number is Not a Armstrong Number: " + armstrongNumber);
        }

    }
}
