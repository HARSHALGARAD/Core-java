package WhileAssingment4;

import java.util.Scanner;

public class Cube {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number :");
	
	int num = sc.nextInt();
	int i = 1;
	
	while(i<=num) {
		
		int cube = i*i*i;
				
		System.out.println("Cube of " +i +" is "+cube);
		i++;
	}
}
}
