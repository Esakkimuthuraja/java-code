
import java.util.*;

class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Redius: ");
        double rediusOfCircle = scan.nextDouble();

        double areaOfCircle;

        double pi = Math.PI;

        areaOfCircle = pi * (rediusOfCircle * rediusOfCircle);

        System.out.println("The Area of the Circle is: " + areaOfCircle);

    }
}
