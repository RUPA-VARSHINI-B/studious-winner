package main;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter a string");
		String input = sca.nextLine();
		if (Ispalindrome(input)) {
			System.out.println("the given string is palindrome");
	
			
		}
		else{
			System.out.println("the given string is not palindrome");
			
		}
	}
	public static boolean Ispalindrome (String input) {
		
		int length = input.length();
		for (int i=0 ; i <length/2 ; i++) {
			if(input.charAt(i)!=input.charAt(length-i-1)) {
				return false;
			}
			
		}
		return true;
		
	}

}
