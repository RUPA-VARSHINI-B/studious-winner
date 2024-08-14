package main;
import java.util.*;
public class Sum_of_no {

	public static void main(String[] args) {
		Scanner sca = new Scanner (System.in);
		System.out.println("Enter the natural no's");
		int num = sca. nextInt ();
        int sum = SumOfNo(num);
        int result = Sumofdigits(num);
        System.out.println("the sum of numbers are:"+sum);
        System.out.println("the sum of numbers are:"+result);
	}
public static int SumOfNo(int num) {
	int sum = 0;
	 String str = String.valueOf(num);
	for(int i=0;i<str.length();i++) {
		sum += Character.getNumericValue(str.charAt(i));	
	}
	return sum;
}
public static int Sumofdigits(int num) {
	int result = 0;
	while (num>0){
		result+=num%10;
		num/=10;
		
	}
	return result;
}
}
