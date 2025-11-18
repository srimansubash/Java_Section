class get{
    int f=1;
    void factorial (int r){
        for(int i=1;i<=r;++i)
        f=f*i;
    }
}  
class calculate extends get{
    void pr(){
        System.out.println("a fact is:"+f);
    }
}
public class Cal {
    public static void main(String args[])
    {
        calculate o=new calculate();
        o.factorial(5);
        o.pr();
    }
}
