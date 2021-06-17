import java.util.Scanner;
public class program4
{
    public static void main(String args[]){
        String names[] = new String[5];
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.printf("Enter the name of student %s", i+1);
            names[i] = sc.next();
            System.out.printf("Enter marks of student %d", i+1);
            marks[i] = sc.nextInt();
        }
        System.out.printf("Students who scored more than 35: ");
        for(int i = 0; i<5; i++){
            if(marks[i] > 35){
                System.out.printf("Name: %s\n Marks:%d\n", names[i], marks[i]);
            }
        }
        sc.close();
    }
}

