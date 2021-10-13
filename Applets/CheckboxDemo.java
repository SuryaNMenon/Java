package Applets;
import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Frame implements ItemListener{
    Label l;
    Checkbox c1, c2, c3, c4;
    TextArea ta;
    
    public CheckboxDemo() //init gui
    {
        setTitle("Ice Cream Machine");
        setSize(400,700);
        setVisible(true);
        setLayout(new FlowLayout());
        
        l = new Label("What's your favourite flavor?");
        c1 = new Checkbox("Vanilla");
        c2 = new Checkbox("Chocolate");
        c3 = new Checkbox("Strawberry");
        c4 = new Checkbox("Rocky Road");
        ta = new TextArea(10,30);
        
        add(l); 
        add(c1); 
        add(c2); 
        add(c3); 
        add(c4); 
        add(ta);
        // Event handling
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent e){
        String s = "You like: ";
        if(c1.getState()) s+=c1.getLabel() + " ";
        if(c2.getState()) s+=c2.getLabel() + " ";
        if(c3.getState()) s+=c3.getLabel() + " ";
        if(c4.getState()) s+=c4.getLabel() + " ";
        ta.setText(s);
    }
    
    public static void main(String[] args) {
        new CheckboxDemo();
    }
}
