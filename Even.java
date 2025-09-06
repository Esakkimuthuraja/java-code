
import java.util.Scanner;

class Even {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("This number is even");

        } else {
            System.out.println("This number is odd");
        }
    }
}
