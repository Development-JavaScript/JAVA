package ch02;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] arg) {
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println(value1 );
		System.out.println(value2);
		System.out.println(value3 );
		
		String str1 = String.valueOf(10);
		System.out.println(str1);
	}

}
