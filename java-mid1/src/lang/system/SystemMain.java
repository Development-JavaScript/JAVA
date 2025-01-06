package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("millis = " + currentTimeMillis);

        // 현재 시간(나노초)르 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다.
        System.out.println("getenv: " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties: " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] coppiedArray = new char[5];
        System.arraycopy(originalArray, 0, coppiedArray, 0, originalArray.length);
        // 배열 출력
        System.out.println("coppiedArray = " + coppiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(coppiedArray));

        //프로그램 종료
        System.exit(0);
    }
}
