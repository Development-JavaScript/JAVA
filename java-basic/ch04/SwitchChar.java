package ch04;

public class SwitchChar {
	public static void main(String[] args) {
		char grade = 'a';
		
		switch(grade) {
		case 'a' :
		case 'A' :
			System.out.println("VVIP 회원입니다.");
			break;
		case 'b' :
		case 'B' :
			System.out.println("우수 회원입니다.");
			break;
		case 'c' :
		case 'C' :
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님 입니다.");
		}
	}

}
