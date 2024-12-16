package ch03;

public class BitLogicaExample {
	public static void main(String[] args) {
		//비트 논리 연산자
		System.out.println("45 & 25 = "  + (45 & 25));
		System.out.println("45 | 25 = "  + (45 | 25));
		System.out.println("45 ^ 25 = "  + (45 ^ 25));
		System.out.println("~25 = "  + (~ 25));
		System.out.println("-----------------------");
		
		byte receiveData = -26;
		
		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//방법2: 자바 API를 이용하여 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test =  230;
		byte btest = (byte) test;
		System.out.println(btest);
		
		int result = 1 <<3;
		System.out.println(result);
	}

}
