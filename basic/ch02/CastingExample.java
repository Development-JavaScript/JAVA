package ch02;

public class CastingExample {
	public static void main(String[] args) {
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);
		
		long ver3 = 300;
		int ver4 = (int) ver3;
		System.out.println(ver4);
		
		int ver5 = 65;
		char ver6 = (char) ver5;
		System.out.println(ver6);
		
		double ver7 = 3.15;
		int ver8 = (int) ver7;
		System.out.println(ver8);
		
		int x = 1;
		int y = 2;
		double result = (double) x /  (double)y;
		System.out.println(result);
	}

}
