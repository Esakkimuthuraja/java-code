 // The Methods are fully void Method with basic patterns

import java.util.*;

class Patternsinmethods {

    public void leftTriangle(int n) { // This is Left Triangle Pattern

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void invertedLeftTriangle(int n) { // This is Inverted Left Triangle Pattern

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void squarePattern(int n) { // This is Square Pattern

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void hallowSquarePattern(int n) { // This is Hallow Square Pattern

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void hallowLeftTriangle(int n) { // This is Hallow Left Triangle pattern

        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void hallowInvertedLeftTriangle(int n) { // This is Hallow Inverted Left Triangle Pattern
        System.out.println(" ");

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                if (i == 1 || j == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = scan.nextInt();

        Patternsinmethods obj = new Patternsinmethods();

        obj.leftTriangle(n);
        obj.invertedLeftTriangle(n);
        obj.squarePattern(n);
        obj.hallowSquarePattern(n);
        obj.hallowLeftTriangle(n);
        obj.hallowInvertedLeftTriangle(n);

        scan.close();

    }

}
