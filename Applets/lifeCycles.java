package Applets;
import java.awt.*;
import java.applet.*;

//<applet code=lifeCycles width=40 height=50></applet>
public class lifeCycles extends Applet {
    public void init(){
        System.out.println("In init method");
    }
    public void start(){
        System.out.println("In start method");
    }
    public void paint(){
        System.out.println("In paint method");
    }
    public void end(){
        System.out.println("In end method");
    }
    public void destroy(){
        System.out.println("In destroy method");
    }
}
