package Applets;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener{
    MenuBar mb;
    Menu file, format;
    MenuItem blank, date, exit, regular, bold, italics, boldalics;
    TextArea ta;
    public MenuDemo(){
        mb = new MenuBar();
        file = new Menu("File");
        format = new Menu("Format Text");
        
        blank = new MenuItem("New");
        date = new MenuItem("Date");
        exit = new MenuItem("Exit");
        file.add(blank); file.add(date); 
        file.addSeparator();
        file.add(exit);
        
        regular = new MenuItem("Regular");
        bold = new MenuItem("Bold");
        italics = new MenuItem("Italics");
        boldalics = new MenuItem("Bold + Italics");
        format.add(regular); format.add(bold); format.add(italics); format.add(boldalics);
        
        ta = new TextArea(30,30);
        setBackground(Color.PINK);
        add(ta);
        
        mb.add(file); 
        mb.add(format);
        
        setMenuBar(mb); // Adds menubar to the applet
        
        blank.addActionListener(this);
        date.addActionListener(this);
        exit.addActionListener(this);
        regular.addActionListener(this);
        bold.addActionListener(this);
        italics.addActionListener(this);
        boldalics.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == blank) 
            ta.setText("");
        else if(ae.getSource() == date) 
            ta.setText("Date is "+ new Date());
        else if(ae.getSource() == exit) 
            System.exit(0);
        else if(ae.getSource() == regular) 
            ta.setFont(new Font("Arial", Font.PLAIN, 20));
        else if(ae.getSource() == bold) 
            ta.setFont(new Font("Arial", Font.BOLD, 20));
        else if(ae.getSource() == italics) 
            ta.setFont(new Font("Arial", Font.ITALIC, 20));
        else if(ae.getSource() == boldalics) 
            ta.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
    }
    
    public static void main(String[] args) {
        Frame F = new MenuDemo();
        F.setTitle("Menu Demo");
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
