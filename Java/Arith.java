import java.util.Scanner;
class set_value
{
    int a,b;
    void set_value(int n1,int n2)
    {
        a=n1;
        b=n2;
    }
}
class addition extends set_value
{
    void add_fn()
    {
        System.out.println("the addition is:"+(a+b));
    }
}
class subraction extends addition
{
    void sub_fn()
    {
        System.out.println(" the sub is"+(a-b));
    }
}
class multiple extends subraction
{
    void mul_fn()
    {
        System.out.println("the mul is"+(a*b));
    }
}
class divide extends multiple
{
    void div_fn()
    {
        System.out.println(" the div is"+(a/b));
    }
}

public class Arith 
{
    public static void main(String args[]){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        divide x=new divide();
        System.out.println("enter two value");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x.set_value(n1, n2);
        x.add_fn();
        x.sub_fn();
        x.mul_fn();
        x.div_fn();
    }
}
