package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void hello(Process process){
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] age){

        System.out.println("Hello 실행");
        hello(() -> {
            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료
        });

        hello(() -> {
            //코드 조각 시작
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
            //코드 조각 종료
        });
    }
}
