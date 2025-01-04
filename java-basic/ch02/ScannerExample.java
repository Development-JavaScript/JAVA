package ch02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		var scanner = new  Scanner(System.in);
		
		System.out.print("X 값 입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("Y 값 입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result); 
		
		while(true) {
			System.out.println("입력 문자열 :  ");
			String data = scanner.nextLine();
			
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	
		
	}
}
