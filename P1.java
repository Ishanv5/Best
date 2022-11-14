//Implement a java program to calculate gross salary & net salary taking the following data.
// • Input: empno, empname, basic
// • Process: DA=70% of basic, HRA=30% of basic, CCA=Rs240/- ,PF=10% of basic PT= Rs100/-
import java.util.*;
class P1
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Employee nos : ");
   int empno=sc.nextInt();
   System.out.println("Enter Employee name : ");
   String empname=sc.next();
   System.out.println("Enter Employee salary : ");
   double salary=sc.nextDouble();
   double DA=0.70*salary;
   double HRA=0.30*salary;
   double CCA=240;
   double PF=0.10*salary;
   double PT=100;
   double net_sal=DA+HRA+CCA;
   double gross_sal=net_sal-PF-PT;
   System.out.println("Gross Salary : " + net_sal);
   System.out.println("Gross Salary : " + gross_sal);

}
}