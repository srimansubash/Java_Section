import java.awt.*;
import java.net.*;
import java.awt.event.*;
public class awt extends Frame
{
    TextField tf,tf1,tf2;
    Label l,l1,l2;

    awt(){
        tf=new TextField();
        tf.setBounds(100,50,85,20);
        tf1=new TextField();
        tf1.setBounds(100,100,85,20);
        tf2=new TextField();
        tf2.setBounds(100,150,85,20);

        l=new Label("a");
        l.setBounds(80,50,85,20);
        l1=new Label("b");
        l1.setBounds(80,100,85,20);
        l2=new Label("add is");
        l2.setBounds(80,150,85,20);

        Button b=new Button("add");
        setBounds(110,190,85,20);

        add(tf);add(tf1);add(tf2);add(l);add(l1);add(l2);add(b);

        setSize(300,300);
        setVisible(true);
        setLayout(null);

        b.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int a=Integer.parseInt(tf.getText());
                int b=Integer.parseInt(tf1.getText());
                int c=a+b;
                tf2.setText("the sum is"+String.valueOf(c));
            }
        });
    }
    public static void main(String args[]){
        awt o=new awt();
    }

}
