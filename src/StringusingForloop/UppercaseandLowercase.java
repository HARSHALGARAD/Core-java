package StringusingForloop;

public class UppercaseandLowercase {

	public static void main(String[] args) {
		
		String name = "Harshal";
		
		int upper = 0;
		int lower = 0;
		
		for(int i =0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upper++;
				
			}
			else if(Character.isLowerCase(ch)) {
				lower++;
				
			}
		}
		System.out.println("Upper letters :"+upper);
		System.out.println("Lower letters :"+lower);
	}
}
