import java.util.*;

class Gamescore{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the Game Score: ");
int score = scan.nextInt();

if(score<50){
System.out.println("You need more scores");
}
if(score>=50 && score<=70){
System.out.println("Excellent Game Play");
}
if(score>70){
System.out.println("Your Mastering the Game");
}

}
}


class Votingnestedif{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.print("Enter the Age: ");
int age = scan.nextInt();

if(age>=18){
System.out.println("Your Eligible for Voting");
}
if(age>=18 && age<60){
System.out.println("Your Not a Senior Citizen");
}
if(age>=60){
System.out.println("He is a Senior Citizen");
}

}
}


class Validtriangle{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size a: ");
int a = scan.nextInt();
System.out.print("Enter the size b: ");
int b = scan.nextInt();
System.out.print("Enter the size c: ");
int c = scan.nextInt();

if(true){
System.out.println("This a valid triangle");
}
if(a==b && b==c && a==c){
System.out.println("This a Equilateral");
}
else if(a==b || b==c || a==c){
System.out.println("This is a Isoscelese");
}
else{
System.out.println("This is a Scalene");
}

}
}