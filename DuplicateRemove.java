
import java.util.*;

class DuplicateRemove {

    static LinkedList<Integer> removeDup(int n, Scanner scan) {
        LinkedList<Integer> rem = new LinkedList<Integer>();//rem means remove

        for (int i = 0; i < n; i++) {
            System.out.print("Add the [" + (i + 1) + "] element: ");
            rem.add(scan.nextInt());
        }

        for (int i = 0; i < rem.size(); i++) {
            for (int j = i + 1; j < rem.size(); j++) {

                if (rem.get(i).equals(rem.get(j))) {
                    rem.remove(j);

                }

            }
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = scan.nextInt();

        System.out.println(removeDup(n, scan));

    }

}
