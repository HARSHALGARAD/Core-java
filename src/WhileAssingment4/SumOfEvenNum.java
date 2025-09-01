package WhileAssingment4;

import java.util.Scanner;

public class SumOfEvenNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		
		int num =sc.nextInt();
		int a =2;
		int sum =0;
		
		while(a<num) {
			sum = sum +a;
			a = a+2;
		
		}
		System.out.println("Sum of even from 1 to "+a + "is" +sum);
	}

}
