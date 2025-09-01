package Assingment3;

import java.util.Scanner;

public class SumofOdd {
	public static void main(String[] args) {
		int sum = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num:");
		int num =sc.nextInt();
		
		for(int i = 1; i<=num; i+=2) {
			
			sum=sum+i;
			
		}
		System.out.println("Sum :"+sum);
	}

}
