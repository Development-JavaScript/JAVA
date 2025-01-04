package ch04;

public class SwitchNoBreak_01 {
	public static void main (String[] args) {
		int time = (int)(Math.random() * 4) +8;
			System.out.println("현재 시간은 " + time + "시");
			
		switch(time) {
		case 8 :
			System.out.println("출근 합니다.");
		case 9 :
			System.out.println("회의르 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		}
	}
}
