import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code = keyboardEventDemo width = 400 height = 500></applet code>
public class keyboardEventDemo extends Applet implements KeyListener {
    Label txtLbl;
    TextArea ta1;
    TextField t;
    public void init(){
        txtLbl = new Label("Enter a key: ");
        t = new TextField(20);
        t.addKeyListener(this);
        ta1 = new TextArea(100,70);
        ta1.setEditable(false);

        add(txtLbl);
        add(t);
        add(ta1);
    }
    public void keyTyped(KeyEvent ke){
        ta1.append("You typed: " + ke.getKeyChar() + "\n");
    }
    public void keyPressed(KeyEvent ke){
        ta1.setText("ASCII value: " + ke.getKeyCode() + "\n");
        t.setText("");
        t.setText(String.valueOf(ke.getKeyChar()));
    }
    public void keyReleased(KeyEvent ke){
        ta1.append("Key released!\n");
    }
}
