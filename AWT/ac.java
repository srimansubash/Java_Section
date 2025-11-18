import java.awt.*;
import java.awt.event.*;
public class ac extends Frame implements ActionListener
{
    TextField tf,tf1;
    ac()
    {    
    
    tf=new TextField();  
    tf.setBounds(120,50,100,20);  
    Button b=new Button("click me");  
    b.setBounds(20,160,100,30); 

    tf1=new TextField();
    tf1.setBounds(120,110,100,20);
    Button b1=new Button("hello");
    b1.setBounds(120,160,100,30);

    add(tf);
    add(b);add(tf1);add(b1);

    b.addActionListener(this);
    b1.addActionListener(this);


    setSize(300,300); 
    setVisible(true); 
    setLayout(null); 
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("My dear boys");
        tf1.setText("how are you?");
    }
    
    public static void main(String args[]){
        ac o=new ac();
    }   
}