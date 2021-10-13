package Applets;
import java.awt.*;
import java.applet.*;

//<applet code=labelTextButtonDemo width=400height=500></appletcode>
public class labelTextButtonDemo extends Applet {
    public void init(){
        Label lblName = new Label("Enter your name:");
        add(lblName);
        Label lblPwd = new Label("Enter your password:");
        add(lblPwd);
        
        TextField txtName = new TextField(30);
        add(txtName);
        TextField txtPwd = new TextField(30);
        add(txtPwd);
        
        txtPwd.setEchoChar('*');
        
        Button btnSubmit = new Button();
        add(btnSubmit);
        Button btnClear = new Button();
        add(btnClear);
    }
    public void paint(Graphics g){
        
    }
}
