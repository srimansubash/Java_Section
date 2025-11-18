import java.io.*;
import java.util.*;
class Mobilephone
{
  int cost,size,pixelsize,mcapacity;
  String Modelno,color,manufactname;
  Mobilephone()
   {
     cost=10000;
     size=6;
     pixelsize=1656;
   }
 Mobilephone(String mn,String c)
  {
    Modelno=mn;
    color=c;
  }
Mobilephone(String mn,String c,String mname)
{
 Modelno=mn;
 color=c;
 manufactname=mname;
 }
Mobilephone(String mn,String c,String mname,int mc)
{
 Modelno=mn;
 color=c;
 manufactname=mname;
 mcapacity=mc;
 }
 void display()
 {
   System.out.println("Model number:"+Modelno);
   System.out.println("Manufacture name:" +manufactname);
   System.out.println("Cost:" +cost);
   System.out.println("size:" +size);
   System.out.println("color:" +color);
   System.out.println("Memory capacity:" +mcapacity);
   System.out.println("camera pixel size:" +pixelsize);
 }
}
public class Mdemo
 {
   public static void main(String [] args)
    {
     Mobilephone m1=new Mobilephone();
     m1.display();
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter the Model number:");
     String s1=sc.nextLine();
    System.out.println("Enter the manufacture name:");
    String s2=sc.nextLine();
    System.out.println("Enter the cost:");
    int s3=sc.nextInt();
    System.out.println("Enter the size:");
    int s4=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the color:");
    String s5=sc.nextLine();
    System.out.println("Enter the memory capacity:");
    int s6=sc.nextInt();
    System.out.println("Enter the camera pixel size:");
    int s7=sc.nextInt();
    Mobilephone m2=new Mobilephone(s1,s5);
    m2.display();
    Mobilephone m3=new Mobilephone(s1,s5,s2);
    m3.display();
    Mobilephone m4=new Mobilephone(s1,s5,s2,s6);
    m4.display();
}
}
