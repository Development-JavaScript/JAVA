package ch02;

public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다");
		}else {
			System.out.println("시작합니다");
		}
		
		int x = 10;
		char y = 6;
		
		boolean result1 = (x +y  == 16);
		boolean result2 = (x != 20);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2:" + result2);

	}

}
