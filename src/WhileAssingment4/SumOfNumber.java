package WhileAssingment4;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		
		int n = 1;
		int sum = 0;
		
		
		while(n<num) {
			sum = sum+n;
			
			n++;
		}
		System.out.println("Sum from 1 to " + n  + "is :" + sum);
	}

}
