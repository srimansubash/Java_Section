class get
{
    double circ;
    int rec;
    void circle (int r)
    {
        circ =3.14*r*r;
    }
void rectangle (int l,int b)
{
    rec =l*b;
}
}
class value extends get{
    void pr(){
    System.out.println("area of circle"+circ);
    System.out.println("area of rectangle"+rec);}
}
public class Area_551 {
    public static void main(String args[])
    {
        value o =new value();
        o.circle(5);
        o.rectangle(8,6);
        o.pr();
    }
}
