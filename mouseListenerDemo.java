import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code = mouseListenerDemo width = 400 height = 500></applet code>
public class mouseListenerDemo extends Applet implements MouseListener{
    Button clkMe;
    public void init(){
        clkMe = new Button("Click Me!!!");
        clkMe.addMouseListener(this);
        add(clkMe);
    }
    public void mouseClicked(MouseEvent me){
        setBackground(Color.GREEN);
        showStatus(me.getX() + "," + me.getY());
    }
    public void mouseEntered(MouseEvent me){
        setBackground(Color.BLACK);
        showStatus("Welcome to the Dark side.");
    }
    public void mouseExited(MouseEvent me){
        setBackground(Color.white);
        showStatus("Back to the Light side!");
    }
    public void mousePressed(MouseEvent me){
        setBackground(Color.red);
        showStatus("Mouse is being pressed!");
    }
    public void mouseReleased(MouseEvent me){
        setBackground(Color.blue);
        showStatus("Mouse was released!");
    }
}
