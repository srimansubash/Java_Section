import java.awt.*;
public class AWT extends Frame
{
    AWT()
    {
        Button b =new Button("click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("this is sample");
        setLayout(null);
        setVisible(true);
    }
public static void main(String args[])
{
        AWT f=new AWT();
}
}