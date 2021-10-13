package Applets;
import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener{
    List os,lang;
    TextArea ta;
    public ListDemo(){
        lang = new List(4, true);
        lang.add("What languages do you know?");
        lang.add("Java");
        lang.add("C++");
        lang.add("Python");
        lang.add(".Net");
        
        os = new List(2, false);
        os.add("What OS are you comfortable with?");
        os.add("Windows");
        os.add("Linux");
        os.select(1); //Selects index 1 as default
        
        lang.addActionListener(this);
        os.addActionListener(this);
        
        ta = new TextArea(40,40); 
        ta.setEditable(false);
        
        add(lang); 
        add(os);
        add(ta);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = "Languages Known: ";
        int index[];
        index = lang.getSelectedIndexes(); // langs.getSelectedIndexes() returns a list(array)
        
        for(int i = 0;i<index.length;i++)
            msg += lang.getItem(index[i]) + "\n";
        msg += "\n";
        msg += "Operating Systems known: ";
        msg += os.getSelectedItem() + "\n";
        
        ta.setText(msg);
    }
    
    public static void main(String[] args) {
        Frame F = new ListDemo();
        F.setTitle("List Demo");
        F.setSize(400,600);
        F.setVisible(true);
        F.setLayout(new FlowLayout());
        F.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
}
