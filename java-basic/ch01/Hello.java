package ch01.sec09;

public class Hello{
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinte = (hour*60) + minute;
		System.out.println("총" + totalMinte + "분");
		// 변수활용하여 코드
		int money = 10;
		int get = (money*2100);
		System.out.println(get + "원 입니다.");
		
		// 2,8,10,16진수
		int x = 0b101;
		int y = 0320;
		int z = 10;
		int c = 0x25;
		System.out.println(x + "와" + y + "와" + z + "와" + c);
		
		
		float  var1 = 0.123456789f;
		double var2 = 0.12345467890123456789;
		
		System.out.println(var1);
		System.out.println(var2);
	}
}