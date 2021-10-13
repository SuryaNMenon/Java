package Applets;
import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener{
    Label lbl;
    Choice deg;
    TextField tf;
    public ChoiceDemo(){
        tf = new TextField(30);
        tf.setEditable(false);
        
        deg = new Choice();
        deg.add("Select your font");
        deg.add("Bold"); 
        deg.add("Italics");
        deg.add("Bold+Italics");
        
        deg.addItemListener(this);
        add(deg);
        add(tf);
    }
    public void itemStateChanged(ItemEvent ie){
        if(deg.getSelectedIndex() == 1){
            tf.setFont(new Font("Arial", Font.BOLD, 20));
            tf.setText("You selected " + deg.getSelectedItem());
        }
        else if(deg.getSelectedIndex() == 2){
            tf.setFont(new Font("Arial", Font.ITALIC, 20));
            tf.setText("You selected "+ deg.getSelectedItem());
        }
        else if(deg.getSelectedIndex() == 3){
            tf.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 20));
            tf.setText("You selected "+deg.getSelectedItem());
        }
    }
    public static void main(String[] args) {
        Frame F = new ChoiceDemo();
        F.setTitle("Choice Demo");
        F.setSize(400,400);
        F.setVisible(true);
        F.setLayout(new FlowLayout());
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
