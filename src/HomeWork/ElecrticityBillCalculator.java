package HomeWork;

import java.util.Scanner;

public class ElecrticityBillCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Total Unit Cunsumed :");
		int unit = sc.nextInt();
		int bill =0;
		
		
		if ((unit<=100)  ) {
			bill = unit*5;
			
		} 
		else {
			if(unit<300) {
			bill =(100*5)+(unit-100)*7;
		}
		else {
			
			bill=(100*5)+(200*7)+((unit-300)*10);
			


		}
		System.out.println("total bill generated "+bill);
	}

	}
}
/*Electricity Bill Calculator
Input total units consumed.
Use nested if-else to calculate cost:
≤100 units: ₹5/unit
101300: ₹7/unit
300: ₹10/unit*/
