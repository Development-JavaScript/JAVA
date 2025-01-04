package ch05;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = 0;
        int[] scores = null;

        while (true){
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            int menu = scanner.nextInt();

            if(menu == 1){
                System.out.print("학생수: ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            }
            else if (menu == 2) {
               for(int i = 0; i < scores.length; i++){
                   System.out.print("scores[" + (i+1) + "]: " );
                   scores[i] = scanner.nextInt();
               }
            }
            else if (menu == 3) {
                for(int x = 0; x < scores.length; x++){
                    System.out.println("scores[" + x + "]: " + scores[x]);
                }
            }
            else if (menu == 4) {
                int max = 0;
                int sum = 0;
                double aver = 0.0;

                for(int i = 0; i < scores.length; i++){
                    sum += scores[i];
                    max = (max < scores[i]) ? scores[i] : max;
                }
                aver = (double) sum / studentNum;
                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + aver);
            }
            else if (menu == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("1~5번 중에서 입력해주세요");
            }
        }

    }
}
