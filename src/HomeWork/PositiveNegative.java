package HomeWork;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number :");
	int number = sc.nextInt();
	
	if (number>=0) {
		System.out.println("Positive Number");
		
	} else {
		System.out.println("Negative Number");

	}
}
}
/*Positive Negative Zero
Input a number.
Check if it's positive, negative, or zero*/
