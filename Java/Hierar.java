import java.util.Scanner;
class set_1
{
    int a,b;
    void get_value()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two value");
        a=sc.nextInt();
        b=sc.nextInt();
    
    }
}
class addition extends set_1
{
    void add_fn()
    {
        System.out.println("the addition is:"+(a+b));
    }
}
class subraction extends set_1
{
    void sub_fn()
    {
        System.out.println(" the sub is"+(a-b));
    }
}
class multiple extends set_1
{
    void mul_fn()
    {
        System.out.println("the mul is"+(a*b));
    }
}
class divide extends set_1
{
    void div_fn()
    {
        System.out.println(" the div is"+(a/b));
    }
}

public class Hierar
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        addition a =new addition();
        a.get_value();
        a.add_fn();
        subraction s=new subraction();
        s.get_value();
        s.sub_fn();
        multiple m=new multiple();
        m.get_value();
        m.mul_fn();
        divide x=new divide();
        x.get_value();
        x.div_fn();
    }
}