package ch02;

public class VariableScopeExample {
	public static void main(String[] arg) {
		
		int v1 = 9;
		if(v1 > 10) {
			System.out.println("15 이상입니다.");
		}else {
			System.out.println("15 이하입니다.");
		}
		
		//int v3 = v1 +v2 +5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러발생
		
		
	}
}
