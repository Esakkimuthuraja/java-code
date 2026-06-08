
import java.util.Scanner;

class QuadraticEquation {

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.println("-------Let's Solve Quadratic Equation-------");

        System.out.print("Enter number a: ");
        double a = scan.nextDouble();

        System.out.print("Enter number b: ");
        double b = scan.nextDouble();

        System.out.print("Enter number c: ");
        double c = scan.nextDouble();

        double d = b * b - 4 * a * c;  //using BODMAS rule first others so roots is first

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The root 1 is: " + root1);
            System.out.println("The root 2 is: " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);

            System.out.println("The both roots are same");
            System.out.println("The root is: " + root);
        } else {
            System.out.println("Antha root ennanu ennaku theriyathu :(");
        }

    }
}
