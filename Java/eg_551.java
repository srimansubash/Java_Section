import java.util.Scanner;
class Area_1
{
    int area(int l,int b)
        {
            int c=(l*b);
            return c;
            
        }
}
public class eg_551 {
    public static void main(String args[])
    {
        
            Area_1 a = new Area_1();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int s=a.area(x,y);
            System.out.println("the rectangle value is"+s);

    }    
}