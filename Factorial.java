package main;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("enter a num to find factorial");
		int num = sca.nextInt();
		int result = fact(num);
		System.out.println("the factorial of "+ num +"is"+result);
		

	}
public static int fact(int num){
	if (num == 0)
	{
		return 1;
	}
	else {
		int result = num * fact(num-1);
		return result;
	}
	
}
}
