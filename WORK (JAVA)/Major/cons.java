import java.util.Scanner;
class get{
    int a,b,sum;
    get(int x,int y){
        a=x;
        b=y;
    }
    void find(){
        sum=a+b;
        System.out.println("the addition of two is:"+sum);
    }
}

public class cons 
{
    public static void main (String args[]){
        get o=new get(5,7);
        o.find();
    }
}
