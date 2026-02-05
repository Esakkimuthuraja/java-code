
import java.util.*;

class FactSum {

    static int FactNum(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = i * fact;
        }

        return fact;
    }

    static int SumNum(int num2) {

        int sum = 0;

        for (int i = 1; i <= num2; i++) {
            sum = i + sum;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        sc.close();

        int result1 = FactNum(num);
        int result2 = SumNum(num2);

        System.out.println("The factorial of the number is: " + result1);
        System.out.println("The sum of the number is: " + result2);

    }
}
