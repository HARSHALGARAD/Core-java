package Assingment3;

import java.util.Scanner;

public class SumEvenNum {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num :");
		int num = sc.nextInt();
		
		for(int i = 2; i<=num; i+=2) {
			sum=sum+i;
		
	}
		System.out.println("Even "+sum );
	}

}
