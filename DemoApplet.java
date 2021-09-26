import java.awt.*;
import java.applet.*;
// <applet code = DemoApplet width=400 height=300></applet>
public class DemoApplet extends Applet{
    public void paint(Graphics g){
        setBackground(Color.green);
        g.drawString("Hello World!",50,150);
        System.out.println("Paint method");
    }
}   