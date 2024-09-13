import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers:");
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        if(a>b){
            if (a>c) {
                System.out.println(+a + " is greater:");
            }
            else {
                System.out.println(+c+ " is greater:");
            }
        } else if (b>a) {
                if(b>c){
                    System.out.println(+b+" is greater:");
                }
                else {
                    System.out.println(+c+" is greater:");
                }
            }
        else {
                System.out.println(+b+ " is greater:");
        }
    }
}