import java.awt.*;
import java.awt.event.*;
public class Mou extends Frame implements MouseListener
{ 
    Label l;
    Mou(){
        addMouseListener(this);

        l=new Label();
        l.setBounds(20,50,100,30);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse entered");
    }    
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse released");
    }
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse pressed");
    }
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse Exited");
    }
    public static void main(String args[])
    {
        Mou o=new Mou();
    }
}
