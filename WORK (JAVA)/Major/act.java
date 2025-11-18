import java.util.Scanner;
class find1{
    int a,b;
    void row(){
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class access extends find1{
    void sun(){
        System.out.println("the add is:"+(a+b));
    }
}
class asub extends find1{
    void moon(){
        System.out.println("the add is:"+(a-b));
    }
}
public class act {
    public static void main(String args[]){
        access b=new access();
        b.row();
        b.sun();
        asub o=new asub();
        o.row();
        o.moon();
    }
}
