import java.util.*;
public class P3
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int bal=0;
System.out.println("***Create your Bank account***");
System.out.println("Enter your name: ");
String name=sc.nextLine();
System.out.println("Welcome "+name+" ");
System.out.println("Please follow the following instructions");
System.out.println("Enter your account number: ");
int ac=sc.nextInt();
System.out.println("Enter your phone no.: ");
long phone=sc.nextLong();
System.out.println("Enter your address: ");
String address=sc.next();
int a=1;
while(true){
System.out.println("\n***Banking System Application***");
System.out.println("------------Menu------------");
System.out.println("1-Deposit");
System.out.println("2-Withdraw");
System.out.println("3-Check Balance");
System.out.println("4-Compute Interest");
System.out.println("5-Exit");
System.out.println("----------------------------");
System.out.println("\nEnter your choice: ");
int c=sc.nextInt();
switch(c){
case 1 :{
System.out.println("Enter the amount to deposit: ");
int deposit=sc.nextInt();
bal=bal+deposit;
System.out.println("Amount is Deposited successfully");
}
break;
case 2 :{
System.out.println("Enter the amount to withdraw: ");
int withdraw=sc.nextInt();
if(withdraw>bal){
System.out.println("Withdrawal Failure");
System.out.println("Please Check Your Entered Amount");
}else{
bal=bal-withdraw;
System.out.println("Amount is Withdrawn successfully");
}
}
break;
case 3 :{
System.out.println("Your balance is "+bal);
}
break;
case 4:{
System.out.println("Enter rate of interest: ");
double r=sc.nextDouble();
System.out.println("Enter time period: ");
double t=sc.nextDouble();
double si=(bal*r*t)/100;
System.out.println("Simple interest: "+si);
}
break;
case 5:{
System.out.println("Thankyou");
}
break;
default:{
System.out.println("Invalid choice");
}
}
System.out.println("----------------------------");
System.out.println("Enter 1-Continue");
System.out.println("Enter 0-Stop ");
System.out.println("----------------------------");
a=sc.nextInt();
}
}
}