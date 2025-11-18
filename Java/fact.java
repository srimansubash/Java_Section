import java.util.Scanner;
class Factorial1
{
    int n;
    void getvalue()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        n=sc.nextInt();  
        System.out.println("the sum of series"+n); 
    }
}
class Factorial2 extends Factorial1
{
    int calculate()
    {
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact =fact*i;
        }
        return fact;
    }
}
class display extends Factorial1
{
    void print_fn(int num)
    {
        System.out.println("the sum of series"+num);
    }
}
public class fact 
{
    public static void main(String args[])
    {
        int sum;
        Scanner sc=new Scanner(System.in);
        Factorial2 f=new Factorial2();
        f.getvalue();
        sum=f.calculate();
        display d=new display();
        d.print_fn(sum);
        

    }   
}