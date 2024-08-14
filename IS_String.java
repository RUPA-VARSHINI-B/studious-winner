package main;
import java.util.Scanner;

public class IS_String {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sca.nextLine();
        isString(str);
    }

    public static void isString(String str) {
        boolean isValid = false;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                isValid = true;
                break;
            }
        }
        
        if (isValid) {
            System.out.println("It's a string");
        } else {
            System.out.println("Enter a valid string");
        }
    }
}

