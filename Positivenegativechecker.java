import java.util.Scanner;

class Positivenegativechecker{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the number: ");
int num = scan.nextInt();

if(num>0){
System.out.println("This number is a positive number");
}
else if(num<0){
System.out.println("This number is a negative number");
}
else{
System.out.println("This number is a zero");
}

}
}