import java.util.Scanner;
class Figure{
    public void area(int a, int b){
        System.out.println("Enter your choice\n1) Rectangle\n2) Triangle");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1)
            System.out.println("Area through figure class is "+ (a * b));
        else if(choice == 2)
        System.out.println("Area is "+ (0.5 * a * b));
        else System.out.println("Wrong choice");
        sc.close();
    }
}

class Rectangle extends Figure{
    public void area(int a, int b){
        System.out.println("Area through Rectangle class is " + (a*b));
    }
}

class Triangle extends Figure{
    public void area(int a, int b){
        System.out.println("Area through Triangle class is "+ (0.5 * a * b));
    }
}

public class methodOverriding {
    public static void main(String[] args){
        Figure f1 = new Figure();
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        f1.area(5, 10);
        r1.area(5, 10);
        t1.area(5, 10);
    }
}
