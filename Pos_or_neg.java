package main;

import java.util.Scanner;

public class Pos_or_neg {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("Enter the natural no's");
		int num = sca. nextInt ();
		if(num>0) {
			System.out.println("the given num is positive");
		}
		else {
			System.out.println("the given num is negative");
		}

	}

}
