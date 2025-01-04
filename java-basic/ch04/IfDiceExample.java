package ch04;

public class IfDiceExample {
	public static void main(String[]args) {
		// 6개 숫자 중 랜덤
		int num = (int)(Math.random() * 2) +2;
		
		if(num == 1) {
			System.out.println("1번 당첨");
		}else if(num == 2) {
			System.out.println("2번 당첨");
		}else if(num == 3) {
			System.out.println("3번 당첨");
		}else if(num == 4) {
			System.out.println("4번 당첨");
		}else if(num == 5) {
			System.out.println("5번 당첨");
		// 6번이 나오면 탈락
		}else {
			System.out.println("탈락");
		}
	}
}
