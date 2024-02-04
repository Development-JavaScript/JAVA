package ch03;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		// 피연산자  ++ : 연산 수행 후  피연산자의 값 +1 증가
 		x++;
 	    //  ++ 피연산자 : 피연산자의 값 +1 증가 후 연산 수행
		++x;
		System.out.println(x);
		
		// 피연산자  -- : 연산 수행 후  피연산자의 값 -1 감소
		y--;
		// -- 피연산자 : 피연산자의 값 -1 감소 후 연산 수행
		--y;
		System.out.println(y);
		
		z = x++;
		System.out.println(z);
		System.out.println(x);
		
		z = ++x;
		System.out.println(z);
		System.out.println(x);
		
		z = ++x + y++;
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		
		
		
	} 

}
