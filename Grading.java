import java.util.Scanner;
class Grading{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number mark: ");
int mark = scan.nextInt();
if(100==mark || mark>=90){
System.out.println(" Your a A grade");
}
else if(mark>=80){
System.out.println("Your a B grade");
}
else if(mark>=70){
System.out.println("Your a C grade");
}
else if(mark>=60){
System.out.println("Your a D grade");
}
else{
System.out.println("Your a Fail");
}

}

}