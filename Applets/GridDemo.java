package Applets;
import java.awt.*;
import java.awt.event.*;

public class GridDemo extends Frame {
    Button b1, b2, b3, b4;
    Label l1, l2;
    TextField t1, t2;
    public GridDemo(){
        
        
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        
        l1 = new Label("Enter first number: ");
        l2 = new Label("Enter second number: ");
        
        t1 = new TextField(20);
        t2 = new TextField(20);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    public static void main(String[] args) {
        Frame F = new GridDemo();
        F.setTitle("Grid Demo");
        F.setSize(400,600);
        F.setVisible(true);
        F.setLayout(new GridLayout(4,2));
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
