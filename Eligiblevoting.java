import java.util.Scanner;

class Eligiblevoting{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = scan.nextInt();

if(age>=18){
System.out.println("Your Eligible for Voting");
}
else{
System.out.print("Your Not Eligible for Voting");
}

}
}

