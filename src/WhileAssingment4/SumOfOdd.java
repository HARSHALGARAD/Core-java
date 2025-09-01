package WhileAssingment4;

import java.util.Scanner;

public class SumOfOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Number :");
		
		int num = sc.nextInt();
		
		int a = 1;
		int sum = 0;
		while(a<=num) {
			if(a%2!=0) {
				sum=sum+a;
			}
			
			
			a++;
		}
		System.out.println(" Sum of Odd 1 to "+num + "is"+sum);
	}

}
