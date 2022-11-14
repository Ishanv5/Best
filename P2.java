//Create a Teacher class and derive Professor / Associate Professor / Assistant Professor 
//class from Teacher class. Define appropriate constructor for all the classes. Also define a method to
 //display information of Teacher. Make necessary assumptions as required.
class Professor
{
   int id;
   String name;
   Professor(int id,String name)
{
  this.id=id;
  this.name=name;
}
  void Display()
{
   System.out.println("ID : " + id);
   System.out.println("Name : " + name);
}
}
class AssProfessor extends Professor
{
  int id;
  String name;
  String dept;
   AssProfessor(int id,String name,String dept)
{
  super(id,name);
  this.dept=dept;
}
 void Display()
{
   super.Display();
   System.out.println("Dept : " + dept);
}
}
class AssoProfessor extends AssProfessor
{
  int id;
  String name;
  String dept;
  double salary;
   AssoProfessor(int id,String name,String dept,double salary)
{
  super(id,name,dept);
  this.salary=salary;
}
 void Display()
{
   super.Display();
   System.out.println("salary : " + salary);
}
}
class P2{
  public static void main(String args []){
   Professor p=new Professor(1,"Ishan");
   AssProfessor ap=new AssProfessor(2,"Akib","Comps");
   AssoProfessor aop=new AssoProfessor(3,"Shubham","IT",45000);
  p.Display();
  ap.Display();
  aop.Display();
}
}
