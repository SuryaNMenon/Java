import java.util.Scanner;

class stackArray
{
    int[] stackArray=new int[10];
    int top=-1;
    Scanner sc= new Scanner(System.in);    
    public void push()
    {
        if(top==10-1)
            System.out.println("Overflow");
        System.out.print("Enter the element : ");
        int elt=sc.nextInt();
        stackArray[++top]=elt;
    }
    public void pop()
    {
        if(top==-1)
            System.out.println("Underflow");
        int elt= stackArray[top--];
        System.out.println(elt);
    }
    public int top()
    {
        return stackArray[top];
    }
}
public class stackWithArrays {
    public static void main(String[] args)
    {
        stackArray s1=new stackArray();
        s1.push();
        s1.push();
        s1.push();
        System.out.printf("TOP %d\n",s1.top());
        s1.pop();
        System.out.printf("TOP %d\n",s1.top());
    }
}