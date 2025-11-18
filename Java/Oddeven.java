class find{
    boolean r;
    int n;
    void check(int a){
        n=a;
        if(a%2==0)
        r=true;
        else
        r=false;
    }
}
class result extends find{
    void pr(){
        if(r)
        System.out.println(n+"is even");
        else
        System.out.println(n+"is odd");
    }
}
public class Oddeven {
 public static void main(String args[]){
    result obj = new result();
    obj.check(5);
    obj.pr();
    obj.check(2);
    obj.pr();
 }   
}
