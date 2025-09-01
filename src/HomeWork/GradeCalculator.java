package HomeWork;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks (0-100) :");
		int mark = sc.nextInt();
		
		if (mark>90) {
			System.out.println("Grade A");
			
		}
		else if(mark>80 && mark<89) {
			System.out.println("Grade B");
			
		}
		else if(mark>70 && mark<79) {
			System.out.println("Grade C");
		}
		else if(mark>60 && mark<69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Failed");

		}
		
	}

}
/*Grade Calculator
Input marks 0100.
Print grade based on this:
90100: A
8089: B
7079: C
6069: D
Below 60: F*/
