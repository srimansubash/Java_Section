package p5;  
import java.util.*;  
import p1.Add;  
import p2.Sub;  
public class Calculator  
{  
public static void main(String args[])  
{  
System.out.print("Enter your choice: ");  
Scanner scan=new Scanner(System.in);  
int t=scan.nextInt();  
switch(t)  
{  
case 1:  
Add a=new Add();  
a.sum();  
break;  
case 2:  
Sub s=new Sub();  
s.diff();  
break;  
}  
}  
}  
