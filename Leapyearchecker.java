import java.util.Scanner;

class Leapyearchecker{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the year: ");
int year = scan.nextInt();

if(year%4==0){
System.out.println("This year is a leap year");
}
else{
System.out.println("This year is not a leap year");
}

}
}