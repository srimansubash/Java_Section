import java.awt.*;
public class Awt extends Frame 
{
    Awt()
    {
        Label n=new Label("User id");
        n.setBounds(20,50,80,20);
        Label n1=new Label("password");
        n1.setBounds(20,110,80,20);

        TextField nTf=new TextField();
        nTf.setBounds(120,50,100,20);
        TextField nTf1=new TextField();
        nTf1.setBounds(120,110,100,20);

        Button b=new Button("submit");
        b.setBounds(20,160,100,30);

        add(n);
        add(n1);
        add(nTf);
        add(nTf1);
        add(b);

        setVisible(true);
        setSize(300,300);
        setLayout(null);
    }
    public static void main(String args[])
    {
        Awt o= new Awt();
    }
}
