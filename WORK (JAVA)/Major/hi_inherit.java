import java.util.Scanner;
class allow{
    int a,b;
    void set(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two values:");
        a=sc.nextInt();
        b=sc.nextInt();

    }
}
class add extends allow
{
    void addfn(){
        System.out.println("the addition of two is"+(a+b));
    }
}
class sub extends allow
{
    void subfn(){
        System.out.println("the subraction of two is"+(a-b));
    }
}
class mul extends allow
{
    void mulfn()
    {
        System.out.println("the multiple of two is"+(a*b));
    }
}
class div extends allow
{
    void divfn(){
        System.out.println("the division of two is"+(a/b));
    }
}
public class hi_inherit {
    public static void main(String args[]){
        add o=new add();
        o.set();
        o.addfn();
        sub t=new sub();
        t.set();
        t.subfn();
        mul r=new mul();
        r.set();
        r.mulfn();
        div e=new div();
        e.set();
        e.divfn();

    }
}
