class Shape{
    public void Draw(){
        System.out.println("Inside Draw function of Shape class");
    }
    public void Erase(){
        System.out.println("Inside Erase function of Shape class");
    }
    public class Circle{
        public void Draw(){
            System.out.println("Inside Draw function of Circle class");
        }
        public void Erase(){
            System.out.println("Inside Erase function of Circle class");
        }
    }
    public class Square{
        public void Draw(){
            System.out.println("Inside Draw function of Square class");
        }
        public void Erase(){
            System.out.println("Inside Erase function of Square class");
        }
    }
    public class Triangle{
        public void Draw(){
            System.out.println("Inside Draw function of Triangle class");
        }
        public void Erase(){
            System.out.println("Inside Erase function of Triangle class");
        }
    }
}

public class program10{
    public static void main(String[] args){
        Shape obj1 = new Shape();
        Shape.Circle obj2 = obj1.new Circle();
        Shape.Square obj3 = obj1.new Square();
        Shape.Triangle obj4 = obj1.new Triangle();
        obj1.Draw();
        obj2.Erase();
        obj3.Draw();
        obj4.Erase();
    }
}