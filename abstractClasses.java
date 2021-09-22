abstract class A{
    public abstract void displayText();
}

class B extends A{
    public void displayText(){
        System.out.println("Call me from B, the class inheriting abstract class A");
    }
}

public class abstractClasses {
    public static void main(String[] args){
        A obj = new B();
        obj.displayText();
    }    
}
