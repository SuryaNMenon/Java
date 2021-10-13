package Applets;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author user
 */
public class Smiley extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    
public static void main(String[] args) {
Frame AppletSmileExample = new Frame("Draw Smiley in Applet Example");
AppletSmileExample.setSize(350, 250);
Applet SmileExample = new Smiley();
AppletSmileExample.add(SmileExample);
AppletSmileExample.setVisible(true);
AppletSmileExample.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
      }
    });
  }
        public void paint(Graphics g){ 
                 g.setColor(Color.darkGray);
                g.setFont(new Font("Arial",Font.BOLD,14));
                g.drawString("Draw Smiley In Applet Example ", 50, 40);
                g.setFont(new Font("Arial",Font.BOLD,10));
                g.drawString("https://ecomputernotes.com", 200, 205);
               
            
                //The Syntax for drawOval(int xTopLeft, int yTopLeft, int width, int height);
                g.drawOval(70, 50, 150, 150); 
                 //The Syntax for fillOval(int xTopLeft, int yTopLeft, int width, int height);
                g.fillOval(80, 100, 50, 20);
                g.fillOval(160, 100, 50, 20);
              
                //Syntax For:- drawString(String str, int xBaselineLeft, int yBaselineLeft); 
                g.drawLine(145, 125, 145, 155); 
                 //Syntax For:- drawArc(int xTopLeft, int yTopLeft, int width, int height, int startAngle, int arcAngle);
                g.drawArc(100, 90, 95, 95, 0, -180);  
        }
}