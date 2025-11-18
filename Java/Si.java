import java.util.Scanner;
class interest{
    int p,n,r;
    double si;
    void getvalue()
    {
        System.out.println("enter the p,n,r value");
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        n=sc.nextInt();
        r=sc.nextInt();
    }
}
class sim extends interest {
    void calculate()
    {
        si=(p*n*r)/100;
    }
}
class simple extends sim{
    void display()
    {
        System.out.println("the si is"+si);
    }
}
public class Si {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        simple a =new simple();
        a.getvalue();
        a.calculate();
        a.display();
    }
}
