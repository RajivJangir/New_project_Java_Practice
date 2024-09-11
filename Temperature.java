import java.util.*;

public class Temperature {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. For Fahrenheit to Celsius:");
        System.out.println("2. For Celsius to Fahrenheit:");
        int a = input.nextInt();
        if (a == 1) {
            System.out.print("Input a degree in Fahrenheit: ");
            float fahrenheit = input.nextFloat();
            float celsius = (float) ((5 * (fahrenheit - 32.0)) / 9.0);
            System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        }
        else if (a == 2){
            System.out.print("Input a degree in Celcius: ");
            float celsius = input.nextFloat();
            float fahrenheit = (float) ((celsius * 9/5) + 32 );
            System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");

        }
    }
}