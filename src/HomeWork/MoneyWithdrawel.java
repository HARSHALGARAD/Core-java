package HomeWork;

import java.util.Scanner;

public class MoneyWithdrawel {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	 System.out.println("Enter Balance Amount :");
	 double a =sc.nextInt();
	 
	 System.out.println("Enter Withdrawel Amount :");
	 double b =sc.nextInt();
	 
	 
	 if ( b%100==0 && b<=a ) {
		 
		 double amount = a-b;
		 System.out.println("Apprve :");
		 System.out.println("Remaining amount  "+amount);
		
	} else {
		System.out.println("reject :");

	}
	 
	 
}
}
/* ATM Withdrawal
Input balance and withdrawal amount.
If withdrawal is a multiple of 100 and ≤ balance, approve. Else reject.
*/