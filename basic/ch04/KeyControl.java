package ch04;

import java.util.Scanner;

public class KeyControl {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isRunning = true;
            int speed = 0;

            while (isRunning) {
                System.out.println("------------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("------------------------");
                System.out.print("선택: ");

                int menu = scanner.nextInt();

                switch (menu) {
                    case 1: // 증속
                        speed++;
                        System.out.println("현재 속도: " + speed + "km");
                        break;
                    case 2: // 감속
                        if (speed > 0) {
                            speed--;
                            System.out.println("현재 속도: " + speed + "km");
                        } else {
                            System.out.println("현재 최저 속도입니다. (" + speed + "km)");
                        }
                        break;
                    case 3: // 중지
                        System.out.println("프로그램을 종료합니다.");
                        isRunning = false;
                        break;
                    default: // 유효하지 않은 입력
                        System.out.println("1~3번 숫자 중 하나를 입력해주세요.");
                        break;
                }
            }
            scanner.close();
        }
}
