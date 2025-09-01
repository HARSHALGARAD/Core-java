package HomeWork;

import java.util.Scanner;

public class CharacterClassifire {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Any Character :");
		char c = sc.next().charAt(0);
		
		
		if (c>'A'  && c<'Z') {
			System.out.println("Uppercase Character");
		}
		else if(c>'a' && c<'z') {
			System.out.println("Lowercase Character");
			
		}
		else if(c>='0' && c<='9') {
			System.out.println("Digit");
		
			
		} else {
         System.out.println("This is special character");
		}

}
}
	/*. Character Classifier
	Input a single character.
	Check if it is uppercase, lowercase, digit, or special character.*/
