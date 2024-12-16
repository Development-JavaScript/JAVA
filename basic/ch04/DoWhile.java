package ch04;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        String message;

        do {
            System.out.print(">");
            message = scanner.nextLine();
            System.out.println(message);
        } while (! message.equals("q"));

        scanner.nextLine();
        System.out.println("종료");
    }
}
