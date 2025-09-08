import java.util.Scanner;

class Multiplechecker{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the number: ");
int num = scan.nextInt();

if(num%7==0){
System.out.println("This number is multiple of 7");
}
else{
System.out.print("This number is not multiple of 7");
}

}
}