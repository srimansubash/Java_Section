import java.util.Scanner;
class Factorial1
{
    int fact,n;
    void setvalue(int a)
    {
        fact=1;
        n=a;
    }
}
class Factorial2 extends Factorial1
{
    void calculate()
    {
        for (int i=1;i<=n;i++)
        {
            fact =fact*i;
        }
    }
}
class Factorial3 extends Factorial2
{
    void display()
    {
        System.out.println("factorial of"+n+"is:"+fact);
    }
}
public class fac 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value:");
        num =sc.nextInt();
        Factorial3 f=new Factorial3();
        f.setvalue(num);
        f.calculate();
        f.display();
        

    }   
}
