package HomeWork;

import java.util.Scanner;
public class BiggestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 1st number  :");
	
     int a =sc.nextInt();

      System.out.println("Enter 2nd Number :");
     int b = sc.nextInt();

     System.out.println("Enter 3rd number :");
      int c =sc.nextInt();
      
      if (a>b && a>c) {
    	  System.out.println("1st is Gretest");
		
	} 
      else if (b>a && b>c) {
    	  System.out.println("2nd is Gretest");
		
	}
      
      else {
    	  System.out.println("3rd is Gretest");

	}
	
	
}
}

/*Biggest Among Three
Input 3 numbers.
Use nested if-else to find and print the greatest number.*/
