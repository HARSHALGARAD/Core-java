package HomeWork;

import java.util.Scanner;

public class TriangleValidity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1st Triangle :");
		int a = sc.nextInt();
		
		System.out.println("2st Triangle :");
		int b = sc.nextInt();
		
		System.out.println("3st Triangle :");
		int c = sc.nextInt();
		
		int sum = a+b+c;
		
	if (sum ==180 && a>0 && b>0 && c>0) {
		System.out.println("Valid Triangle");
	} else {
		System.out.println("Invalid Triangle");

	}
			
		
	}
	

}
/*Triangle Validity
Input 3 angles.
Check if they form a valid triangle (sum = 180 and all > 0.*/
