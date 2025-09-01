package StringusingForloop;

public class CountSpace {
	public static void main(String[] args) {
		
		String src = "mfdk kmke hb j l";
		
		int count =0;
		
		for(char ch : src.toCharArray()) {
			
			if(ch ==' ') {
				count++;
			}
			
		}
		System.out.println("Total Space: "+count);
	}

}
