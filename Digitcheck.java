package main;
import java.util.Scanner;

public class Digitcheck {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sca.nextLine();
        containsDigit(str);
    }

    public static void containsDigit(String str) {
        // Regular expression to check if the string contains at least one digit
        if (str.matches(".*\\d.*")) {
            System.out.println("The string contains a digit.");
        } else {
            System.out.println("The string does not contain any digits.");
        }
    }
}
