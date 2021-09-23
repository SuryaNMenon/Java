import java.util.Scanner;
public class exceptionHandling {
    public static void main(String[] args){
        int[] arr ={2,1,5,1,3};
        try{
            System.out.println(arr[3]/0);
        }
        catch(ArithmeticException e){
            System.err.println("An arithmetic error occured!");
        }
        try{
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Array index is out of bounds!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        try{
            System.out.println("You entered: " + Integer.parseInt(sc.next()));
        }
        catch(NumberFormatException e){
            System.out.println("You did not enter a number!");
        }
        finally{
            System.out.println("Finally code");
            sc.close();
        }
    }
}
