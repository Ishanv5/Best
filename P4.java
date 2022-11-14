import java.util.*;
class Rectangle
{
  double length;
  double breadth;
   
  void setDim(double length,double breadth)
   {
      this.length=length;
      this.breadth=breadth;
   }
   void Calculate_Area()
   {
     double area=length*breadth;
     System.out.println("Area : " + area);
   }
}
class P4
{
   public static void main(String args [])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Length : ");
      double length=sc.nextDouble();
      System.out.println("Enter Breadth : ");
      double breadth=sc.nextDouble();
      Rectangle r=new Rectangle();
      r.setDim(length,breadth);
      r.Calculate_Area();
   }
}