package Applets;
import java.awt.*;
import java.awt.event.*;

public class Traffic extends Frame implements ItemListener{
    Checkbox stop, wait, go;
    CheckboxGroup cbg;
    String msg = "";
    public Traffic(){
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
        Frame F = new Traffic();
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
    @Override
    public void paint(Graphics g){
        msg = cbg.getSelectedCheckbox().getLabel();
        g.drawOval(100,100,50,50);
    }
    public void itemStateChanged(ItemEvent e){
        
    }
}

