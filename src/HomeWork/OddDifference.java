package HomeWork;

import java.util.Scanner;

public class OddDifference {
    public static void main(String[] args) {
	Scanner sc = new Scanner("System.in");
	System.out.println("Enter 1st number :");
	int a = sc.nextInt();
	
	System.out.println("Enter 2nd number :");
	int b =sc.nextInt();
	
	if (a % 2 != 0 && b % 2 != 0) {
        int diff = Math.abs(a - b); // absolute difference
        System.out.println("Absolute difference: " + diff);
    } else {
        System.out.println("Invalid");

	}
	
}
}
/*Odd Difference Evaluator
Input two integers.
If both are odd, print their absolute difference. If one is even, print "Invalid"*/