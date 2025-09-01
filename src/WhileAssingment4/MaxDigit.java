package WhileAssingment4;

public class MaxDigit {
	public static void main(String[] args) {
		
		int num = 5854;
		
		int max = 0;
		while(num!=0) {
			int digit = num%10;
			
			if(digit>max) {
				
				max = digit;
			}
			num=num/10;
			
		}
		System.out.println("Max Digit :"+max);
	}

}
