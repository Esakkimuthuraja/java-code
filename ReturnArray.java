
import java.util.*;

class ReturnArray {

    static int[] returnArray(Scanner scan) {
        System.out.print("Enter the Length: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the Element: ");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < len; i++) {
            System.out.println("The Element of " + "[" + i + "] " + "= " + arr[i]);
        }
        return arr;
    }

    static int[] addArrayElement(Scanner scan) {
        System.out.print("Enter the Length: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {

            System.out.print("Enter the Element: ");
            arr[i] = scan.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("--------------------------------------");
        System.out.println(" The Total Sum of Element is: " + sum);
        System.out.println("--------------------------------------");

        for (int i = 0; i < len; i++) {
            System.out.println("The Element of " + "[" + i + "] " + "= " + arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        returnArray(scan);
        System.out.println("--------------Next--------------");
        addArrayElement(scan);

    }
}
