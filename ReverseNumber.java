
import java.util.*;

class ReverseNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int i = scan.nextInt();

        int reminder = 0;
        int reverseNumber = 0;

        while (i != 0) {

            reminder = i % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            i = i / 10;
        }
        System.out.println("The Reverse Number is: " + reverseNumber);
    }
}
