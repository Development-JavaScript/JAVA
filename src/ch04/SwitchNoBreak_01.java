package ch04;

public class IfExample {
	public static void main(String[] args) {
		int score = 92;
		
		if(score >=90) {
			System.out.println("통과");
		}else if(score >= 80) {
			System.out.println("보류");
		//80점 미만
 		}else {
			System.out.println("탈락");
		}
	}

}
