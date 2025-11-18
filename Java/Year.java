import java.util.Scanner;
class leapyear1
{
    int year;
    void set_year(int n)
    {
        year=n;
    }
}
class leapyear2 extends leapyear1
{
    String res;
    void find()
    {
        if(year%4==0)
        res="leap year";
        else
        res="non leap year";
    }
}
class leapyear3 extends leapyear2{
    void display()
    {
        System.out.println("the year"+year+"is"+res);
    }
}
public class Year {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.println("enter an year");
        p=sc.nextInt();
        leapyear3 s = new leapyear3();
        s.set_year(p);
        s.find();
        s.display();
    }
    
}
