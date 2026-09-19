
import java.util.Scanner;

class IntegerSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int number = scan.nextInt();
        int remd = 0;
        int reverseNumber = 0;

        int addNumber = 0;
        int addRemd = 0;
        int addReverse = 0;

        int evenNumber = 0;
        int evenRemd = 0;
        int evenReverse = 0;

        while (number != 0) {

            remd = number % 10;
            reverseNumber = reverseNumber * 10 + remd;
            number = number / 10;
            if (remd % 2 == 0) {
                addNumber = addNumber * 10 + remd;
                while (addNumber != 0) {
                    addRemd = addNumber % 10;
                    addReverse = addReverse * 10 + addRemd;
                    addNumber = addNumber / 10;
                }

            }

            if (remd % 2 == 1) {
                evenNumber = evenNumber * 10 + remd;
                while (evenNumber != 0) {

                    evenRemd = evenNumber % 10;
                    evenReverse = evenReverse * 10 + evenRemd;
                    evenNumber = evenNumber / 10;
                }

            }
        }

        /*

         */
        System.out.println("Add Numbers : " + addNumber);
        System.out.println("Even Number:  " + evenNumber);
    }
}
