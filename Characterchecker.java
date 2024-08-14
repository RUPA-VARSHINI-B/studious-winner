package main;
import java.util.*;
public class Characterchecker{
	public static void main(String []args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("Enter the string");
		String input = sca.nextLine();
		Vowel(input);
	}
	public static void Vowel(String input) {
		String str = input.toLowerCase();
		Set<Character > vowel = new HashSet<>(Arrays.asList('a','e','i','o','u'));
		
		for(char c :str.toCharArray()) {
		   if(Character.isLetter(c)) {
		
			if(vowel.contains(c)) {
			
				System.out.println(c+"it is vowel");
					
				
			}
			else {
			
				System.out.println(c+"it is consonents");
			}
		}
	}
	}}
