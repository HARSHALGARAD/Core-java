package Assingment3;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Num :");
		int num =sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			int cube=i*i*i;
			System.out.println("Number is"+i+ "ad cube is"+i+"is"+cube);
			
		}
		
		}

}
