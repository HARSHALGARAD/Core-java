package HomeWork;

import java.util.Scanner;



public class SwitchcaseCalculator {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter 1st number :");
	int a =sc.nextInt();
	
	System.out.println("Enter 2nd number :");
	int b =sc.nextInt();
	
	System.out.println("Choose Operator (+,-,*,/) :");
	char operator = sc.next().charAt(0);
	 
	switch (operator) {
	case '+': {
		
		System.out.println("Addition :"+(a+b));
	}
	case '-':{
		System.out.println("Subsraction :"+(a-b));
	}
	case '*':{
		System.out.println("Multipication :"+(a*b));
	}
	case '/':{
		
		System.out.println("Divide "+(a/b));
	}
	default:
		System.out.println("Invalid Operator ");
	}
}
}