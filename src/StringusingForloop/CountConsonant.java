package StringusingForloop;

public class CountConsonant {
	public static void main(String[] args) {
		
		String name = "Harshal";
		
		int count =0;
		
		name = name.toLowerCase();
		
		for(int i = 0; i<name.length(); i++) {
			
			char ch =name.charAt(i);
			
			if(ch>='a' && ch<='z'  && ch!='a' && ch!='e' && ch !='i' && ch !='o' && ch != 'u') {
				
				count++;
			}
			
		}
		System.out.println("Consinants Count : "+count);
		
	}

}
