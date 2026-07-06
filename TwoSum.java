
import java.util.*;

class TwoSum {//leetcode problem

    static int[] twoSum(Scanner scan) {
        System.out.print("Enter the Length: ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        int target = 10;

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the Elements: ");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.println("The Element of " + "[" + i + "] " + "= " + arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    System.out.println("[" + i + "," + j + "] " + " the position equals to target ");
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        twoSum(scan);
    }
}
