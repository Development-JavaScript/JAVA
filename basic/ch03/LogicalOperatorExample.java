package ch03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'a';
		// int charCode = 'A';
		
		if( (65<=charCode) & (charCode<=90)) {
			System.out.println("대문자");
		} if((97<=charCode) && (charCode<=122)) {
			System.out.println("소문자");
		}
		
		//---------------------------------------------------
		
		int value = 6;
		// int value = 7;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if (!result) {
			System.out.println("2 또는 3의 배수가 아닙니다");
		}
	}

}
