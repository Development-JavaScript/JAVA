package ch04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runing = true;
        int amount;

        while (runing){
            System.out.println("-------------------------------");
            System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                System.out.print("예금액> ");
                amount = scanner.nextInt();
                ExData.inAmount(amount);

            } else if (menu == 2) {
                System.out.print("출금액> ");
                amount = scanner.nextInt();
                ExData.outAmount(amount);

            } else if (menu == 3) {
                ExData.setBank();
            } else if (menu == 4) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
