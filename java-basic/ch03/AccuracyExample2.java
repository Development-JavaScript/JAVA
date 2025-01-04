package ch03;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		int result = totalPieces - number;
		System.out.println("10조각에서 남은 조각 : " + result);
		System.out.println("사과 1개에서 남은 양 : " + result/10.0);
		
		int x = 5;
		double y = 0.0;
		double z = x / y;
		//double z = x % y;
		//잘못된 코드
		System.out.println(z);
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		
	}

}
