package StringusingForloop;

public class CountDigit {
public static void main(String[] args) {
	
	String day = "Mon1132132day";
	
	int count = 0;
	
	for(int i = 0; i<day.length(); i++ ) {
		
		if(Character.isDigit(day.charAt(i))) {
			count++;
			
		}
		
		
	}
	System.out.println("Number of digit in the String: "+count);
}

}