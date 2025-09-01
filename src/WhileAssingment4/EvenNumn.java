package WhileAssingment4;

import java.util.Scanner;

public class EvenNumn {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number :");
	int num = sc.nextInt();
	int a = 1;
	System.out.println("Even Number" + num + "is :");
	
	while(a<=num) {
			
			System.out.println(2*a + "");
			a++;
			
		}
		
		
	}
	
}

