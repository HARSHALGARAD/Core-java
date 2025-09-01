package HomeWork;

import java.util.Scanner;

public class ExamPassFail {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Marks in English :");
		int a = sc.nextInt();
		
		System.out.println("Enter Marks in Physics :");
		int b = sc.nextInt();
		
		System.out.println("Enter Marks in Maths   :");
		int c = sc.nextInt();
		
		
		if (a>33 && b>33 && c>33) {
			System.out.println("Pass");
			
			
		} else {
			System.out.println("Fail");

		}
		
	}

}
/*Exam Pass/Fail
Input marks in 3 subjects.
If any subject is below 33, print "Fail", else print "Pass".*/