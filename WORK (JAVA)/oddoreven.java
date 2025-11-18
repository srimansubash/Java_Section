import java.util.Scanner;
class oddoreven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a value:");
        n=sc.nextInt();
        if(n%2==0)
            System.out.println("the given no is even\t"+n);
        else 
        System.out.println("the no is odd\t"+n);
    }
}