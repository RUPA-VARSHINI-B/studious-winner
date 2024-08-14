package main;
import java.util.*;

public class Occurance {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sca.nextLine();
        countWordOccurrences(str);
    }

    public static void countWordOccurrences(String str) {
        // Convert the string to lower case and split it into words
        String[] words = str.toLowerCase().split("\\s+");
        
        // Use a HashMap to store the word counts
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        // Iterate over the array of words
        for (String word : words) {
            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Otherwise, add the word to the map with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
