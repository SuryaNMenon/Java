import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code=labelTextButtonDemo width=400 height=500></applet code>
public class labelTextButtonDemo extends Applet implements ActionListener {
    Label lblName, lblPwd, lblMsg;
    Button btnSubmit, btnClear;
    TextField txtName, txtPwd;
    public void init(){
            lblName = new Label("Enter your name:");
            add(lblName); // adds to the container
            lblPwd = new Label("Enter your password:");
            add(lblPwd);
            
            txtName = new TextField(30);
            add(txtName);
            txtPwd = new TextField(30);
            add(txtPwd);
            
            txtPwd.setEchoChar('*');
            
            btnSubmit = new Button("Submit");
            btnSubmit.addActionListener(this);
            add(btnSubmit);

            btnClear = new Button("Clear");
            btnClear.addActionListener(this);
            add(btnClear);
            lblMsg = new Label("");
            add(lblMsg);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btnSubmit){ 
            String n = txtName.getText();
            txtName.setText("");//setText - sets the text field's text
            lblMsg.setText("Welcome "+ n);
            showStatus("Submitted");
    }
        else{ 
            showStatus("Cleared");
            txtPwd.setText("");
        }
    }
}