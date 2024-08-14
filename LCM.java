package main;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
       Scanner sca = new Scanner(System.in);
       System.out.println("enter a 1st number");
       int a = sca.nextInt();
       System.out.println("enter a 2st number");
       int b = sca.nextInt();
       int result= LCM(a,b);
       System.out.println("the lcm of 2 numbers are"+result);

	}
public static int LCM(int a, int b) {
	int max=Math.max(a, b);
	int lcm =max;
	if(lcm%a!=0||lcm%b!=0)
	{
		lcm+=max;
	} return lcm;
	
	
}
}
