import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        System.out.println("Enter your choice of Fruits:");
        System.out.println("Mango");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Graphs");
        System.out.println("Orange");
        System.out.println("Papaya");
        Scanner sc  = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "Mango" : {
                System.out.println("Enter the amount in kg you want:");
                int num = sc.nextInt();
                int price = num * 100;
                System.out.println("The total price of "+num+"Kg Mango is: " + price + "Rs.");
                break;
            }
            case "Banana" : {
                System.out.println("Enter the amount in kg you want:");
                int num = sc.nextInt();
                int price = num * 50;
                System.out.println("The total price of "+num+"Kg Banana is: " + price + "Rs.");
                break;
            }
            case "Apple" : {
                System.out.println("Enter the amount in kg you want:");
                int num = sc.nextInt();
                int price = num * 200;
                System.out.println("The total price of "+num+"Kg Apple is: " + price + "Rs.");
                break;
            }
            case "Graphs" : {
                System.out.println("Enter the amount in kg you want:");
                int num = sc.nextInt();
                int price = num * 150;
                System.out.println("The total price of "+num+"Kg Graphs is: " + price + "Rs.");
                break;
            }
            case "Orange" : {
                System.out.println("Enter the amount in kg you want:");
                int num = sc.nextInt();
                int price = num * 120;
                System.out.println("The total price of "+num+"Kg Orange is: " + price + "Rs.");
                break;
            }
            case "Papaya" : {
                System.out.println("Enter the amount in kg you want:");
                int num = sc.nextInt();
                int price = num * 80;
                System.out.println("The total price of "+num+"Kg papaya is: " + price + "Rs.");
                break;
            }
            default:
                System.out.println("Please Enter Above Fruit Items Only:");

        }


    }
}