package main;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("Enter a string");
		String str = sca.nextLine();
		duplicated(str);
	}
 public static void duplicated(String str) {
	 str= str.toLowerCase();
	 String [] word = str.split("\\s+");
			 
	  Set<String> seen = new HashSet<>();
	  Set<String> duplicated= new HashSet<>();
	  for( String c : word)
	  {
		  if(seen.contains(c))
		  {
			  duplicated.add(c);
			 
		  }
		  else {
			  seen.add(c);
	
		  }
	  }
	  
	  if(!duplicated.isEmpty()) {
		  System.out.println("the duplicated words are :"+ duplicated);
	  }
	  else
	  {
		  System.out.println("No  duplicated elements found");
	  }
 }
}
