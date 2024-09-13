import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter the Number for which you want to find Fibonacci Number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 3;
        if (n==1){
            System.out.println(+a);
        }
        else if(n == 2){
            System.out.println(+b);
        }
        else {
           while (count<=n){
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            System.out.println(b);
        }

    }
}
