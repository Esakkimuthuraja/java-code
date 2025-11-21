 import java.util.*;
class SwitchCase{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a Number to stop a Loop: ");
int stop = scan.nextInt();
System.out.print("Enter a number to Choose a Case Number: ");
int num = scan.nextInt();
for(int i = 1; i<=stop; i++){
    switch(num){
case 1:
System.out.println(i);
break;
case 2:
if(i%2==0){
System.out.println(i);
}
break;
case 3:
if(i%2==1){
System.out.println(i);
}
break;
case 4:
System.out.println("Esakkimuthu Raja");
break;

}}}}