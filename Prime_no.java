package main;
import java.util.Scanner;

public class Prime_no {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sca.nextInt();
        sca.close();

        if (primeno(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean primeno(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, hence not a prime number
            }
        }
        return true; // No divisors found, num is prime
    }
}
