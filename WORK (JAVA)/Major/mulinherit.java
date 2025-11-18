import java.util.Scanner;
class set1{
    int a,b;
    void getvalue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b value:");
        a=sc.nextInt();
        b=sc.nextInt();

    }
}
class set2 extends set1{
    int sum;
    void perform(){
        sum=a+b;
    }
}
class set3 extends set2{
    void display(){
        System.out.println("the addition of two is:"+sum);
    }
}

 class mulinherit {
    public static void main(String args[]){
        set3 u=new set3();
        u.getvalue();;
        u.perform();
        u.display();
    }
}
