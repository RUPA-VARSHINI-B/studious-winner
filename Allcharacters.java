package main;
import java.util.*;

public class Allcharacters {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the String");
		String input = sca.nextLine();
		
	 ArrayList<Character> allCharacters = new ArrayList<>();
		
     ArrayList<Character> NonrepeatedChar = new ArrayList<>();
     
      for(char c : input.toCharArray())
      {
    	  if(allCharacters.contains(c)) {
    		  NonrepeatedChar.remove((Character)c);
    	  }
    	  else {
    		  allCharacters.add(c);
    		  NonrepeatedChar.add(c);
    	  }
    	  }
      
	System.out.println("Allcharacters" + allCharacters);
	System.out.println("NON repeating characters" + NonrepeatedChar);

}}
