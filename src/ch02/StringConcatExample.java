package ch02;

public class StringConcatExample {
	public static void main(String[] arg) {
		// 숫자 연산
		int result = 1 + 2 + 3;
		System.out.println(result);
		
		//결합 연산
		String result2 = 10+2+"8";
		System.out.println(result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println(result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println(result4);
		
		String result5 = "10" + (2+8);
		System.out.println(result5);
	}

}
