import java.util.Scanner;
public class fac 
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int fact=1;
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is"+fact);
    }    
}
