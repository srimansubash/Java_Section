import java.awt.*;
import java.awt.event.*;
public class all extends Frame implements ActionListener
{
    TextField tf,tf1;
    all()
    {
        tf=new TextField();
        tf.setBounds(120,160,100,20);
        tf1=new TextField();
        tf1.setBounds(120,110,100,20);
        Button b=new Button("click me");
        b.setBounds(20,160,100,30);
        Button b1=new Button("submit");
        b1.setBounds(120,160,100,30);

        b.addActionListener(this);
        b1.addActionListener(this);

        add(b);add(b1);add(tf);add(tf1);

        setSize(300,300);
        setVisible(true);
        setLayout(null);
    }   
    public void actionPerformed(ActionEvent e){
        tf.setText("Hello");
        tf1.setText("SJC welcomes you");
    }
    public static void main(String args[]){
        all o=new all();
    }
}
