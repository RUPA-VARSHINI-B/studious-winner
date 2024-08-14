package main;
import java .util.*;
public class Gcd {

	public static void main(String[] args) {
      Scanner sca = new Scanner (System.in);
      System.out.println("enter a number 1 to find gcd");
      int a= sca.nextInt();
      System.out.println("enter a number 2 to find gcd");
      int b= sca.nextInt();
      int result=GCD(a,b);
      System.out.println("the GCD of 2 numbers are :"+result);

	}
public static  int GCD(int a,int b) {
	if(b==0) {
		return a;
	}
	
		return GCD(b,a%b);
	
}
}
