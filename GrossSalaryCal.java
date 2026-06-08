
import java.util.*;

class GrossSalaryCal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Basic Salary: ");
        double basicSalary = scan.nextDouble();

        double HRA;// 20%
        double DA; // 80%

        HRA = (basicSalary * 20) / 100;
        DA = (basicSalary * 80) / 100;

        System.out.println("The HRA is: " + HRA);
        System.out.println("The DA is: " + DA);

        double grossSalary = basicSalary + HRA + DA;

        System.out.println("The Gross Salary is: " + grossSalary);

        scan.close();

    }
}
