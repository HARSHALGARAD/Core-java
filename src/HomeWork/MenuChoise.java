package HomeWork;

import java.util.Scanner;

public class MenuChoise {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter 1st number :");
	int a = sc.nextInt();
	
	System.out.println("Enter 2st number :");
	int b = sc.nextInt();
	
	System.out.println("Enter your choice(+,-,*,/) :");
	char choice =sc.next().charAt(0);
	
	if (choice =='+') {
		System.out.println("Addition :"+(a+b));
		
	} 
	else if(choice =='-') {
		System.out.println("Substraction :"+(a-b));
		
	}
	else if(choice == '*') {
		System.out.println("Multipication :"+(a*b));
	}
	else if(choice == '/') {
		
		System.out.println("Division  :"+(a/b));
	}
	else {
       System.out.println("Invalid Choice");
	}
}
}
/*. Menu Choice Math Ops)
Input two numbers.
Input a choice 1: add, 2: subtract, 3: multiply, 4: divide).
Print result using nested if-else.*/
