import java.util.Scanner;
class Threelarge{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number a: ");
int a = scan.nextInt();
System.out.print("Enter a number b: ");
int b = scan.nextInt();
System.out.print("Enter a number c: ");
int c = scan.nextInt();
 
if(a>b && b>c){
System.out.println("a is greater than b and c");
}
else if(a<b && b>c){
System.out.println("b is greater than a and c");
}
else{
System.out.println("c is greater than a and b");
}
}
}
