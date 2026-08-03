
import java.util.*;

class JaggedArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many Rows? ");
        int numOfRow = scan.nextInt();

        int[][] jaggedArray = new int[numOfRow][];

        for (int row = 0; row < numOfRow; row++) {
            System.out.print("How many Columns? ");
            int numOfColumn = scan.nextInt();
            jaggedArray[row] = new int[numOfColumn];

            for (int column = 0; column < numOfColumn; column++) {

                System.out.print("Enter the element [" + row + "," + column + "] Position: ");
                jaggedArray[row][column] = scan.nextInt();

            }
            System.out.println();
        }
        System.out.println("<---------------------------------------->");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {

                System.out.print(jaggedArray[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}
