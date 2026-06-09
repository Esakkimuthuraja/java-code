
import java.util.*;

class SumOfNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the NUmber: ");
        int i = scan.nextInt();

        int sumOfNumber = 0;
        int reverseNumber = 0;
        int reminder;

        while (i != 0) {
            reminder = i % 10;
            i = i / 10;
            sumOfNumber = reminder + sumOfNumber;
        }
        System.out.println(sumOfNumber);
    }
}
