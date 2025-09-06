import java.util.Scanner;
class Twolarge{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number a: ");
int a = scan.nextInt();
System.out.print("Enter a number b: ");
int b = scan.nextInt();

if(a>b){
System.out.println("a is greater than b");
}else{
System.out.println("b is greater than a");
}
}
}
