import java.util.Scanner;
class stud_details
{
    void name_dno()
    {
    System.out.println("sriman ");
    System.out.println("551 ");
    }
}
class stud_marks extends stud_details
{
    void value()
    {
        int n,b,total,percentage;
        Scanner sc = new Scanner(System.in);
            System.out.println("enter a value of java ");
            n = sc.nextInt();
            System.out.println("enter value of dt");
            b = sc.nextInt();
            System.out.println("java "+ n);
            System.out.println("dt "+ b);
            total = n+b;
            System.out.println("total "+total);
            percentage =total/2;
            System.out.println("percentage "+percentage);

    }
}
public class inherit
{
        public static void main (String[] args)
        {
            stud_marks x= new stud_marks();
            x.name_dno();
            x.value(); 
           
        }
}