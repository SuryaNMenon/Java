package Applets;
import java.awt.*;
import java.awt.event.*;

public class GridDemo2 extends Frame {
    Button b[]; //b1, b2, b3, b4
    String names[] = {"Contacts","Messaging", "Call Log", "Games", "Settings", "Applications", "Hub", "Zone"};
    
    public GridDemo2(){
        int len = names.length;
        b = new Button[names.length];
        for(int i = 0; i <len ; i++){
            b[i] = new Button(names[i]); //b[0...len-1] = new Button("Contacts" .... "Zone");
            add(b[i]);
        }
    }
    public static void main(String[] args) {
        Frame F = new GridDemo2();
        F.setTitle("Grid Demo 2");
        F.setVisible(true);
        F.setSize(400,500);
        F.setLayout(new GridLayout(2,4));
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        })
        
        ;
    }
}
