import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {

        System.out.println("Simple Calculator ");
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your Choice:");
        System.out.println("1. For Addition");
        System.out.println("2. For Subtraction:");
        System.out.println("3. For Multiplication:");
        System.out.println("4. For Division:");

        int operation = sc.nextInt();
        int c;

        if (operation == 1)
        {
            c = a+b;
            System.out.println("Addition is :"+ c);
        }
        else if (operation == 2){
            c = a-b;
            System.out.println("Subtraction is "+ c);
        }
        else if (operation == 3) {
            c = a*b;
            System.out.println("Multiplication is :"+ c);
        }
        else if (operation == 4){
            c = a/b;
            System.out.println("Division is :"+ c);
        }
        else {
            System.out.println("Please Enter valid choice :");
        }
    }
}