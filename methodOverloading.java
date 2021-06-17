class areaFinder
{
    public void area(int a)
    {
        System.out.printf("Area is %d\n", a*a);
    }
    public void area(int breadth, int width)
    {
        System.out.printf("Area is %d\n", breadth * width);
    }
    public void area(double radius)
    {
        System.out.printf("Area is %d\n", 3.14*radius*radius);
    }
}

public class methodOverloading {
    public static void main(String args[]){
        areaFinder obj = new areaFinder();
        obj.area(10);
        obj.area(10, 5);
        obj.area(5);
    }
}

