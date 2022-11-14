import java.util.*;
class P5{
public static void main(String arg[]){
Scanner t=new Scanner(System.in);
Vector<String> v1=new Vector<String>();
System.out.println("Enter no. of Strings:");
int n=t.nextInt();
for(int i=0;i<n;i++){
System.out.println("Enter string:");
String a=t.next();
v1.addElement(a);
}
while(true){
System.out.println("\nMenu\n1-Check element\n2-Add element\n3-Display\n4-Exit\nEnter Choice:");
int ch=t.nextInt();
if(ch==4){
break;
}
switch(ch){
case 1:{
System.out.println("Enter string to be checked:");
String s=t.next();
if(v1.contains(s)){
v1.removeElement(s);
System.out.println("Element Deleted");
}
else{
System.out.println("Element not present");
}
}
break;
case 2:{
System.out.println("Enter element to be inserted:");
String s=t.next();
v1.addElement(s);
System.out.println("Element added");
}
break;
case 3:{
System.out.println("Vector is "+v1);
}
break;
default:{
System.out.println("Enter valid choice");
}
break;
}
}
}
}