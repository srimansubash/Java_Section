import java.util.Scanner;
class Areas
{
    void Area(double r)
    {
        double pi=3.14;
        double a=pi*r*r;
        System.out.println("the area of circle"+a);
    }
    void Area(double l,double b)
    {
        double c=l*b;
        System.out.println("the area of rectangle"+c);
       
    }
    void Area(int b,int h)
    {
        int d=b+h;
        System.out.println("the area of triangle"+d);
    }
}
public class meth
{
    public static void main(String args[])
    {
        Areas o=new Areas();
        Scanner sc=new Scanner(System.in);
        double q=sc.nextDouble();
        double w=sc.nextDouble();
        double e=sc.nextDouble();
        int r=sc.nextInt();
        int t=sc.nextInt();

        o.Area(q);
        o.Area(w,e);
        o.Area(r,t);
    }
}