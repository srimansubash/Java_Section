package alpha;
import java.util.Scanner;
public class addition
{
    public static void add()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value a");
    int a=sc.nextInt();
    System.out.println("enter the value b");
    int b=sc.nextInt();
    int c=a+b;
    System.out.println("Addition of A and B is"+c);
    }

}
