package ch01.sec09;

public class ByteExample {
	public static void main(String[] args) {
		// short 는 37867 까지만 
		short var1 = 32767;
		// byte 는 127 까지만
		byte var2 = 127;
		//char 는 65534
		char var3 = 65;
		// int 는 2,147,483,647
		int var4 = 2147483646;
		
		System.out.println(var1 + "," + var2 + "," + var3+","+var4);
	}
}
