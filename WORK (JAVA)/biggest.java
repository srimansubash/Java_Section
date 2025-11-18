import java.util.Scanner;
public class biggest 
{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a,b,c values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b)
        if(a>c)
        {
        System.out.println("a is greater "+a);
        }
        else
        {
        System.out.println("c is greater"+c);
        }
        else
        if(b>c)
        {
        System.out.println("b is greater"+b);
        }
        else
        {
        System.out.println("c is greater"+c);
        }
    }    
}
