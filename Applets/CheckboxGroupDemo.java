package Applets;
import java.awt.*;
import java.awt.event.*;

public class CheckboxGroupDemo extends Frame implements ItemListener{
    Label lbl;
    Checkbox c1, c2, c3, c4;
    CheckboxGroup cbg;
    TextArea ta;
    public CheckboxGroupDemo(){
        setTitle("Colour machine");
        setSize(400,700);
        setVisible(true);
        setLayout(new FlowLayout());
        
        lbl = new Label("Pick a colour:\n");
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Red", cbg, false);
        c2 = new Checkbox("Blue", cbg, false);
        c3 = new Checkbox("Green", cbg, false);
        c4 = new Checkbox("Yellow", cbg, false);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        
        ta = new TextArea(30,30);
        ta.setEditable(false);
        
        add(lbl);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(ta);
    }
    public void itemStateChanged(ItemEvent e){
        String s = "You picked ";
        if(c1.getState()){
            setBackground(Color.RED);
            s+=c1.getLabel() + "!";
        }
        if(c2.getState()){
            setBackground(Color.BLUE);
            s+=c2.getLabel() + "!";
        }
        if(c3.getState()){
            setBackground(Color.GREEN);
            s+=c3.getLabel() + "!";
        }
        if(c4.getState()){
            setBackground(Color.YELLOW);
            s+=c4.getLabel() + "!";
        }
        ta.setText(s);
    }
    public static void main(String[] args) {
        new CheckboxGroupDemo();
    }
}
