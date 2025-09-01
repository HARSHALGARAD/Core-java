package HomeWork;

import java.util.Scanner;

public class LeapyearChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :");
		int year = sc.nextInt();
		
		if (year%4==0 && year%100==0  || year%400 !=0) {
			System.out.println("Leap year");
			
		} else {
			System.out.println("Not Leap Year");

		}
	}

}
/*. Leap Year Checker
Input a year.
Check if itʼs a leap year using nested conditions (divisible by 4, not 100 unless divisible by 400.*/
