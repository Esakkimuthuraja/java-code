import java.util.Scanner;

class Divisiblechecker{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = scan.nextInt();

if(num%3==0 && num%5==0){
System.out.println("This number is divisible by 3 and 5");
}
else{
System.out.println("This number is not divisible by 3 and 5");
}

}
}
