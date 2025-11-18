import java.util.Scanner;
class set_1
{
    char big;
    int a,b;
    void get_value()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two value");
        a=sc.nextInt();
        b=sc.nextInt();
    
    }
}
class biggest extends set_1
{
    char find()
    {
        if(a>b)
        big='a';
        else 
        big='b';
        return big;
    }
}
class display extends set_1
{
    void print_fn(char bigger)
    {
        System.out.println(bigger+"is biggest");
    }
}

public class big {
    public static void main(String args[])
    {
        char res;
        Scanner sc=new Scanner(System.in);
        biggest o =new biggest();
        o.get_value();
        res=o.find();
        display n = new display();
        n.print_fn(res); 

    }
}
