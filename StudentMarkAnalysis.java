
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class StudentMarkAnalysis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many number of Student? ");
        int size = scan.nextInt();
        scan.nextLine();

        Map<String, Integer> student = new LinkedHashMap<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter student name: ");
            String name = scan.nextLine();

            System.out.print("Enter the Mark: ");
            int mark = scan.nextInt();
            scan.nextLine();

            student.put(name, mark);
        }
        System.out.println("Students: ");
        for (String i : student.keySet()) {
            System.out.println(i + " --> " + student.get(i));
        }

        int max = 0;
        int min = 0;

        for (String i : student.keySet()) {
            if (student.get(i) > max) {
                max = student.get(i);
            }
        }

        System.out.println("  ");

        System.out.println("Highest Mark: " + max);

        int sum = 0;
        float avg = 0;
        for (String i : student.keySet()) {
            sum = sum + student.get(i);
        }
        for (String i : student.keySet()) {
            avg = sum / size;
        }
        System.out.println("Average Mark: " + avg);
        int count = 0;
        for (String i : student.keySet()) {
            if (student.get(i) >= 80) {
                count += 1;
            }
        }
        System.out.println("Student scoring 80 or Above: " + count);
        System.out.println("  ");

        System.out.print("Enter student name: ");
        String entry = scan.nextLine();
        System.out.println(entry + "'s mark: " + student.get(entry));

    }
}
