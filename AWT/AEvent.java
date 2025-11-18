import java.awt.*;  
import java.awt.event.*;
class AEvent extends Frame implements ActionListener{  
TextField tf,tf1;  
AEvent(){  
 
tf=new TextField();  
tf.setBounds(120,50,100,20);  
Button b=new Button("click me");  
b.setBounds(20,160,100,30); 

tf1=new TextField();
tf1.setBounds(120,110,100,20);
Button b1=new Button("submit");
b1.setBounds(120,160,100,30);

b.addActionListener(this);
b1.addActionListener(this);
 
add(b);add(tf);add(b1);add(tf1);
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
tf.setText("My Dear Boys");  
tf1.setText("How are you?");
}  
public static void main(String args[]){  
new AEvent();  
}  
}  