import java.awt.*;
import java.awt.event.*;

public class TrafficApplet extends Frame implements ItemListener{
    Checkbox stop, wait, go;
    CheckboxGroup cbg;
    String msg = "";
    public TrafficApplet(){
        cbg = new CheckboxGroup();
        stop = new Checkbox("STOP", cbg, false);
        wait = new Checkbox("WAIT", cbg, false);
        go = new Checkbox("GO", cbg, false);

        add(stop); add(wait); add(go);

        stop.addItemListener(this);
        wait.addItemListener(this);
        go.addItemListener(this);
    }
    public static void main(String[] args){
        Frame F = new TrafficApplet();
        F.setTitle("Traffic Lights");
        F.setSize(400,400);
        F.setVisible(true);
        F.setLayout(new FlowLayout());
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        msg = cbg.getSelectedCheckbox().getLabel();
        g.drawOval(100,100,50,50);
        g.drawOval(100,160,50,50);
        g.drawOval(100,220,50,50);

        if(msg == "STOP"){
            g.setColor(Color.RED);
            g.fillOval(100,100,50,50);
        }
        else if(msg == "WAIT"){
            g.setColor(Color.YELLOW);
            g.fillOval(100,160,50,50);
        }
        else if(msg == "GO"){
            g.setColor(Color.GREEN);
            g.fillOval(100,220,50,50);
        }
    }
    public void itemStateChanged(ItemEvent e){
        repaint();
    }
}

