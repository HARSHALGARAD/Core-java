package Assingment3;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number for Table :");
		int num = sc.nextInt();
		
		for(int i = 10; i>=1; i--) {
			int table = i*num;
			System.out.println(table);
		} 
	}

}
