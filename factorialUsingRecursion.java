public class factorialUsingRecursion {
    public static void main(String[] args){
        int number = 5;
        int fact = factorial(number);
        System.out.printf("Factorial of " + number + " is "+ fact);
    }
    public static int factorial(int num){
        if (num >= 1)
            return num * factorial(num-1);
        else
            return 1;
    }
}
