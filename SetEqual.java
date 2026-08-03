
import java.util.*;

class SetEqual {

    static Set<Integer> twoSetEqual(int n, Scanner scan) {

        Set<Integer> num1 = new HashSet<Integer>();
        Set<Integer> num2 = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the Elements For num1: ");
            num1.add(scan.nextInt());

        }

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the Elements For num2: ");
            num2.add(scan.nextInt());
        }

        if (num1.equals(num2)) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Not Equal");
        }

        return num1;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = scan.nextInt();

        twoSetEqual(n, scan);
    }
}
