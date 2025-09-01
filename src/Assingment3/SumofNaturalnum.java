package Assingment3;

import java.util.Scanner;

public class SumofNaturalnum {
	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			sum=sum+i;
			
		}
		System.out.println("sum of :"+num+"natural num is :"+sum);
		}

}
