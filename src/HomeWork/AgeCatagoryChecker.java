package HomeWork;

import java.util.Scanner;

public class AgeCatagoryChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age :");
	int age =sc.nextInt();
	
	if(age>=0 && age<12) {
		System.out.println("Child");
		
	} 
	else if(age>13 && age<17) {
		System.out.println("Teen");
	}
	else if(age >18 && age <59) {
		System.out.println("Adult");
		
	}
	else {
		System.out.println("Sinior");

	}
}
}
/*Age Category Checker
Input age.
Categorize:
012: Child
1317: Teen
1859: Adult
60: Senior*/