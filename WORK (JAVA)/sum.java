import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s,n;
        System.out.println("enter a value:");
        n=sc.nextInt();
        s=(n*(n+1))/2;
        System.out.println("the sum of 1 to n is"+s);
    }    
}
