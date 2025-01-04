package ch03;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		
		byte v1 = 11;
		byte v2 = 4;
		long v4 = 10L;
		
		// 모든 피연산자는 int 타입으로 자동 변한 후 연산
		int result1 = v1 + v2;
		System.out.println("result1 : " + result1);
		
		
		// 모든 피연산자는 long 타입으로 자동 변환 후 연산
		long result2 = v1 + v2 - v4;
		System.out.println("result2 : " + result2);
		
		
		// double 타입으로 강제 변환 후 연산
		double result3 = (double) v1 / v2;
		System.out.println("result3 : " + result3);
		
		// % 나눗셈의 나머지를 산출 
		int result4 = v1 % v2;
		System.out.println("result4 : " + result4);
		
	}

}
