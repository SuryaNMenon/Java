import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        System.out.println("Enter choice\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Square\n6) Square Root\n7) Factorial\n8) Power/Exponent\n 0) Exit");
        n = sc.nextInt();
        while(n!=0){
            switch(n){
                case 1:
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int sum = addition(a, b);
                    System.out.printf("Sum is " + sum);
                    break;
                case 2:
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int diff = subtraction(a, b);
                    System.out.printf("Difference is " + diff);
                    break;
                case 3:
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int prod = multiplication(a, b);
                    System.out.printf("Product is " + prod);
                    break;
                case 4:
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int quotient = division(a, b);
                    System.out.printf("Quotient is " + quotient);
                    break;
                case 5:
                    a = sc.nextInt();
                    int square = square(a);
                    System.out.printf("Square is " + square);
                    break;
                case 6:
                    a = sc.nextInt();
                    double sqrRoot = squareRoot(a);
                    System.out.printf("Square root is " + sqrRoot);
                    break;
                case 7:
                    a = sc.nextInt();
                    int fact = factorial(a);
                    System.out.println("Factorial is "+ fact);
                    break;
                case 8:
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int pow = power(a, b);
                    System.out.println("Power of a to b is "+ pow);
                    break;
                default: 
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println("Enter choice\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Square\n6) Square Root\n7) Factorial\n8) Power/Exponent\n 0) Exit");
            n = sc.nextInt();
        }
        sc.close();
    }
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int square(int a){
        return a^2;
    }
    public static double squareRoot(double a){
        return Math.sqrt(a);
    }
    public static int factorial(int a){
        if(a == 1) return a * factorial(a-1);
        else return 1;
    }
    public static int power(int a, int b){
        return a^b;
    }
}
