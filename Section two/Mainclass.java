class classA
{
    int a=5;
    int b=6;
    int result;
}
class classB extends classA
{
    public void add()
    {
        result=a+b;
    }
    public void showresult()
    {
        System.out.println("Addition of two numbers="+result);
    }
}

public class Mainclass 
{
        public static void main(String args[])
        {
            classB b= new classB();
            b.add();
            b.showresult();
        }
}