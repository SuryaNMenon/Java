package Applets;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author surya
 */
public class AwtCalc extends Frame implements ActionListener{
    Label l1, l2, l3;
    Button b1, b2, b3, b4, b5;
    TextField t1, t2, t3;
    public AwtCalc(){
        setLayout(null);
        l1 = new Label("Enter first number");
        l2 = new Label("Enter second number");
        l3 = new Label("Answer is");
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,130,130,20);
        l3.setBounds(50,170,100,20);
        add(l1); add(l2); add(l3);
        
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("x");
        b4 = new Button("/");
        b5 = new Button("Clear");
        b1.setBounds(110,220,40,20);
        b2.setBounds(150,220,40,20);
        b3.setBounds(190,220,40,20);
        b4.setBounds(230,220,40,20);
        b5.setBounds(170,260,40,20);
        add(b1); add(b2); add(b3); add(b4); add(b5);

        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        t1.setBounds(200,100,50,20);
        t2.setBounds(200,130,50,20);
        t3.setBounds(200,170,50,20);
        add(t1); add(t2); add(t3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }
    public static void main(String[] args) {
        Frame F = new AwtCalc();
        F.setTitle("Calculator using AWT");
        F.setSize(400,400);
        F.setVisible(true);
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        int i = Integer.parseInt(t1.getText());
        int j = Integer.parseInt(t2.getText());

        if(ae.getSource() == b1)
            t3.setText(String.valueOf(i+j));
        if(ae.getSource() == b2)
            t3.setText(String.valueOf(i-j));
        if(ae.getSource() == b3)
            t3.setText(String.valueOf(i*j));
        if(ae.getSource() == b4)
            t3.setText(String.valueOf(i/j));
        if(ae.getSource() == b5)
            t3.setText("");
    }
}

