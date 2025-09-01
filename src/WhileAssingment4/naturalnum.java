package WhileAssingment4;

import java.util.Scanner;

public class naturalnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		
		int num = sc.nextInt();
		int a= 1;
		System.out.println("the first " + num + "natural number is :");
		
		while(a<=num) {
			System.out.println(a);
			a++;
		}
		
	}
}
