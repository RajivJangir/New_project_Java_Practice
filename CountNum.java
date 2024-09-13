import java.util.*;
public class CountNum {
    public static void main(String[] args) {

        System.out.println("Enter the Numbers:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;
        System.out.println("Enter a number which you want check:");
        int b = in.nextInt();
        while (a > 0) {
            int rem = a%10;

            if (rem == b) {
                count++;
            }
            a = a/10;
        }
        System.out.println(count);
    }

}