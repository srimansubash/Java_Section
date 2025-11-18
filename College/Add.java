package p1;  
import java.util.*;  
public class Add  
{  
int s;  
public void sum()  
{  
System.out.print("Enter the first number: ");  
Scanner sc=new Scanner(System.in);  
int x=sc.nextInt();  
System.out.print("Enter the second number: ");  
int y=sc.nextInt();  
s=x+y;  
System.out.println("sum="+s);  
}  
}  