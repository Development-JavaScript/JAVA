package ch03;

public class BitShiftExample {
	public static void main(String[] args) {
		//비트 이동 연산자
		//<<
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 *( int) Math.pow(2, 3);
		System.out.println(result1);
		System.out.println(result2);
		// >>
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2,3);
		System.out.println(result3);
		System.out.println(result4);
		//>>>
		int num3 = -8;
		int result5 = num3 >>> 3;
		System.out.println(result5);
		
		int value = 772;  // [00000000] [00000000] [00000011](3) [00000100](4) = 772
		
		//우측으로 3byte(24bit)  이동
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.print(int1);
		//우측으로 3byte(16bit)  이동
		byte byte2 = (byte) (value >>> 16);
		int int2 = byte2& 255;
		System.out.print(int2);
		//우측으로 3byte(8bit)  이동
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.print(int3);
		// 끝 1바이트만 읽음
		byte byte4 = (byte) (value);
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.print(int4);
	}
}
