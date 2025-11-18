package p2;  
import java.util.*;  
public class Sub  
{  
int d;  
public void diff()  
{  
System.out.print("Enter the first number: ");  
Scanner scan=new Scanner(System.in);  
int x=scan.nextInt();  
System.out.print("Enter the second number: ");  
Scanner scan1=new Scanner(System.in);  
int y=scan1.nextInt();  
d=x-y;  
System.out.println("Difference="+d);  
}  
}  