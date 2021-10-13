package Applets;

import java.awt.*;
import java.awt.event.*;
public class FrameDemo extends Frame{
    Label l;
    Checkbox c1, c2, c3, c4;
    String s = "You selected ";
    public FrameDemo(){
        setTitle("Ice cream machine");
        setSize(200,400);
        setVisible(true);
        setLayout(new FlowLayout());
        l = new Label("What ice-cream do you like?");
        add(l);
        c1 = new Checkbox("Mint Choco-Chip");
        c2 = new Checkbox("Rocky Road");
        c3 = new Checkbox("Peanut butter & chocolate");
        c4 = new Checkbox("Rainbow Road");
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }
    public static void main(String[] args) {
        new FrameDemo();
    }
   
}


