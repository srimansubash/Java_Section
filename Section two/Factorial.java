import java.util.Scanner;
public class Factorial {
   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the number:");
      int n,i,fact=1;
      n=in.nextInt();
      for(i=1;i<=n;i++)
      {
         fact=fact*i;
      }
      System.out.println("Factorial Of"+ n + " Is :" +fact);
   }
}