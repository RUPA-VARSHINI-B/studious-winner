package main;

import java.util.*;

public class Vowels {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a character:");
        String input = sca.next();

        // Ensure the input is a single character
        if (input.length() != 1) {
            System.out.println("Please enter a single character.");
        } else {
            char character = input.toLowerCase().charAt(0);
            checkVowel(character);
        }
    }

    public static void checkVowel(char c) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        if (vowels.contains(c)) {
            System.out.println("The given character is a vowel.");
        } else {
            System.out.println("The given character is a consonant.");
        }
    }
}

