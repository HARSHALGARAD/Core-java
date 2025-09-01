package HomeWork;

import java.util.Scanner;

public class VowelCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character (A-Z) :");
		char ch = sc.next().charAt(0);
		
		if ((ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')) {
			System.out.println("Vowel");
			
		} else {
			System.out.println("constant");

		}
	}

}
/*Vowel or Consonant
Input a character.
Check if it's a vowel (a, e, i, o, u – case insensitive) or consonant.*/
