package ch03;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		//대입 연산자
		int result = 0;
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 3;
		System.out.println(result);
		
		//삼항(조건) 연산자
		var name = "원동인"; 
		int score = 91;
		char  grade = (score > 90) ? 'A' : ((score > 80)   ? 'B' : 'C');
		System.out.println(name +  "님의 등급은 : "+  grade + "등급 입니다.");
		
		//연산의 방향과 우선순위
		int var1 = 1;
		int var2 = 3;
		int var3= 2;
		int result5 = var1 + var2 * var3;
		int result6 = (var1 + var2)  * var3;
		System.out.println(result5 + " , " + result6);
		
		// 십의 자리 이하를 버리는 코드
		int p = 534;
		int s = 30;
		System.out.println(p / 100*100);
		
		int test1 = (p/s);
		int test2 = (p%s);
		System.out.println(test1 + test2);
		System.out.println(test1 + test2);
		}
}
