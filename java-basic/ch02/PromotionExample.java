package ch02;

public class PromotionExample {
	public static void main(String[] args) {
		
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(byteValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longVlaue : "  +  longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double dobleValue = floatValue;
		System.out.println("dobleValue : " + dobleValue);

	
		double  doubleValue = 3.14;
		
		
		System.out.println(doubleValue);
	}

}
