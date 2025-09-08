import java.util.Scanner;

class Vowelsconsoant{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the Character: ");
char a = scan.nextLine().charAt(0);

if(a=='a' || a=='A' || a=='e' || a=='E' || a=='i' || a=='I' || a=='o' || a=='O' || a=='u' || a=='U'){
System.out.println("The Character is a vowel");
}
else{
System.out.println("The Character is a consonant");
}

}
}