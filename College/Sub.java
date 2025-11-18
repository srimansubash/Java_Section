package part1;
import java.util.Scanner;
public class Sub {
    int s;
    public void set(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        s=a-b;
        System.out.println("the sub is :"+s);

    }
    
}
