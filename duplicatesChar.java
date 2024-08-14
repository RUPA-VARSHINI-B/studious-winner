package main;
import java.util.*;
public class duplicatesChar{

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = sca.nextLine();
		duplicated(str);
	}
 public static void duplicated(String str) {
	 str= str.toLowerCase();
	 
			 
	  Set<Character> seen = new HashSet<>();
	  Set<Character> duplicated= new HashSet<>();
	  for( Character c : str.toCharArray())
	  {
		  if(seen.contains(c))
		  {
			  duplicated.add((Character)c);
			 
		  }
		  else {
			  seen.add(c);
	
		  }
	  }
	  
	  if(!duplicated.isEmpty()) {
		  System.out.println("the duplicated characters are :"+ duplicated);
	  }
	  else
	  {
		  System.out.println("No  duplicated elements found");
	  }
 }
}