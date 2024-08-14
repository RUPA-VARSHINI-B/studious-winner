package main;
import java.util.*;

public class Count_of_Vowel {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sca.nextLine();  
        Vowel(input);
    }

    public static void Vowel(String input) {
        String str = input.toLowerCase();
        Map<Character, Integer> vowels = new HashMap<>();
        Map<Character, Integer> consonants = new HashMap<>();
        Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {  
                if (vowelSet.contains(c)) {
                    vowels.put(c, vowels.getOrDefault(c, 0) + 1);
                } else {
                    consonants.put(c, consonants.getOrDefault(c, 0) + 1);
                }
            }
        }
        
        System.out.println("Vowels:");
        for (Map.Entry<Character, Integer> entry : vowels.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Consonants:");
        for (Map.Entry<Character, Integer> entry : consonants.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
};
