package main;
import java.util.*;
public class Fibinocii {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("enter a natural no");
		int num = sca.nextInt();
        fibinocii(num);
         
	}
public static void fibinocii(int num) {
	int a= 0;
	int b=1;
	System.out.print("Fibonacci Series: " + a + " " + b);
	for(int i=2;i< num;i++) {
		int next = a+b;
		
		System.out.print(" " + next);
		a=b;
		b= next;
		
	}
	System.out.println();
}}
