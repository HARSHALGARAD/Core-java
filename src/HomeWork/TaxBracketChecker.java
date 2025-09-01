package HomeWork;

import java.util.Scanner;

public class TaxBracketChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Income :");
	int income = sc.nextInt();
	
	sc.close();
	if (income<=250000) {
		int tax = 0;
		
		System.out.println("No tax :"+tax);
		
	} 
	else if(income>=250000 && income<=500000) {
		
		int tax1=(income/100)*5;
		System.out.println("Tax 5% :"+tax1);
		
	}
	else if(income>=500000 && income<=1000000) {
		
		int tax2=(income/100)*20;
		System.out.println("Tax 20% :"+tax2);
	}
	else {
		int tax3=(income/100)*30;
		System.out.println("Tax 30% :"+tax3);

	}
}
}
/*. Tax Bracket Checker
Input income.
Tax slabs:
2.5L: No tax
2.5L5L: 5%
5L10L: 20%
10L: 30%
*/
