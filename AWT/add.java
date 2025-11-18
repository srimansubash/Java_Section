import java.awt.*;
import java.net.*;
import java.awt.event.*;

public class add extends Frame { 
            TextField tf1; 
            TextField tf2;
            TextField tf3; 
            Label l1;
            Label l2;
            Label l3; 
            Button b;
                    add() { 
                          setTitle("Adder"); 
                          tf1 = new TextField(); 
                          tf1.setBounds(100, 50, 85, 20);
                          tf2 = new TextField(); 
                          tf2.setBounds(100, 100, 85, 20); 
                          tf3 = new TextField(); 
                          tf3.setBounds(100, 150, 85, 20);
                          b = new Button("Add"); 
                          b.setBounds(110,190,85,20);
                          l1 = new Label("01"); 
                          l1.setBounds(80, 50, 85, 20); 
                          l2 = new Label("02"); 
                          l2.setBounds(80, 100, 85, 20); 
                          l3 = new Label("The result is"); 
                          l3.setBounds(80, 150, 85, 20); 

                          add(b); 
                          add(tf1); 
                          add(tf2); 
                          add(tf3);
                          add(l1);
                          add(l2);
                          add(l3) ;

                          setSize(300,300); 
                          setVisible(true); 

        b.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) { 
                    int a = Integer.parseInt(tf1.getText());
                    int b = Integer.parseInt(tf2.getText()); 
                    int c = a + b; 
                    tf3.setText("sum is = " + String.valueOf(c)); 
                                      }
                }); 
            } 
public static void main(String []args) { 
                   new add();
          } 
}