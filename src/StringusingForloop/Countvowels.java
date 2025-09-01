package StringusingForloop;

public class Countvowels {
	public static void main(String[] args) {
		
		String name = "Harshal";
		
		for(int i = 0; i<name.length(); i++) {
			
			if(name.charAt(i)!='a') {
				System.out.println(name.charAt(i));
				
			}
		}
		
	}

}
