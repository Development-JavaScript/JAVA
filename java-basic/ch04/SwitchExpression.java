package ch04;

public class SwitchExpression {
	public static void main(String[] args) {
		char grade = 'a';
		char grade2 = 'C';
		
		switch(grade) {
			case 'A', 'a' -> {System.out.println("SVIP 등급");}
			case 'B', 'b' -> {System.out.println("VIP 등급");}
			case 'C', 'c' -> {System.out.println("Gold 등급");}
			default  -> {System.out.println("일반 등급");}
		}
		
		switch(grade2) {
			case 'A', 'a' -> System.out.println("SVIP 등급");
			case 'B', 'b' -> System.out.println("VIP 등급");
			case 'C', 'c' -> System.out.println("Gold 등급");
			default  -> System.out.println("일반 등급");
		}
	}
}
