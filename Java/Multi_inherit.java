class students
{
    int marks =78;
}
class teachers extends students
{
    float salary =40000;
}
class principal extends teachers
{
    float bonous=10000;

}
public class Multi_inherit {
    public static void main(String args[])
    {
        principal o=new principal();
        System.out.println("teacher salary is"+o.salary);
        System.out.println("students mark is"+o.marks);
        System.out.println("principal bonous is"+o.bonous);
    }
    
}
