package ch04;

public class InNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 20) + 81;
		System.out.println("점수 : " + score);
		String grade;
		String pass;
		
		if(score>=90) {
			pass = "통과";
			
			if(score>=95) {
				grade ="A+";
			}else {
				grade ="A";
			}
		}else  {
			pass="탈락";
			
			if(score >=85) {
				grade ="B+";
			}else {
				grade ="B";
			}
		}
		System.out.println("학점 : " + grade);
		System.out.println("합격여부 : " + pass);
	}
}
