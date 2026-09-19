
import java.util.Scanner;

class SecondLargest {

    static int secondMaxElement(Scanner scan) {

        int firstLarger = 0;
        int secondLarger = 0;

        System.out.println("What is the Length? ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Element [" + i + "] =");
            arr[i] = scan.nextInt();
        }

        for (int i : arr) {
            if (firstLarger < i) {
                secondLarger = firstLarger;
                firstLarger = i;
            }
            if (secondLarger < i && i != firstLarger) {
                secondLarger = i;
            }
        }
        return secondLarger;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(secondMaxElement(scan));

    }
}
