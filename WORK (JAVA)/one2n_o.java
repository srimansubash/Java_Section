import java.util.Scanner;
public class one2n_o 
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }    
}
