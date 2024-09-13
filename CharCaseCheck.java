import java.util.*;

public class CharCaseCheck {
    public static void main(String[] args) {

        System.out.println("Enter a Character:");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("LowerCase");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("UpperCase");
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}