package Applets;
import java.awt.*;
import java.awt.event.*;

public class BorderAndPanels extends Frame{
    Button b1, b2, b3;
    Checkbox c1, c2, c3;
    Panel p1, p2, p3;
    Label lbl;
        
    public BorderAndPanels(){
        p1 = new Panel(); p1.setBackground(Color.RED);
        p2 = new Panel(); p2.setBackground(Color.GREEN);
        p3 = new Panel(); p2.setBackground(Color.BLUE);
        
        
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        p1.add(b1); p1.add(b2); p1.add(b3);
        
        c1 = new Checkbox("Checkbox 1");
        c2 = new Checkbox("Checkbox 2");
        c3 = new Checkbox("Checkbox 3");
        p2.add(c1); p2.add(c2); p2.add(c3);
        
        lbl = new Label("This is the only label :/");
        p3.add(lbl);
        
        add(p1, BorderLayout.EAST);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        Frame F = new BorderAndPanels();
        F.setTitle("Border and Panels");
        F.setSize(400,600);
        F.setVisible(true);
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
}
