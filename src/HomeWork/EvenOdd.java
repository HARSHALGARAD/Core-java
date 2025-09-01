package HomeWork;

import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number :");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2st number :");
		int b = sc.nextInt();
		
		int greater = (a>b)?a:b;
		int smaller = (a<b)?a:b;
		
		if (a%2==0) {
			System.out.println("The number is Greater"+greater);
			
			
			
		} else {
			System.out.println("The number is Smaller"+smaller);

		}
		
		
		
		
	}

}
/*Even or Odd Difference
Input two integers.
Print the larger one only if it is even; else print the smaller one.*/
