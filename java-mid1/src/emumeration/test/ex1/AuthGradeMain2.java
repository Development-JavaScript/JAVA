package emumeration.test.ex1;

import java.util.Scanner;

import static emumeration.test.ex1.AuthGrade.GUEST;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + " 입니다.");

        System.out.println("=== 메뉴 목록 ===");
        System.out.println(authGrade.getPages());
    }
}
