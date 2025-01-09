package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(14, 43, 20);

        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        //계산(불변)
        LocalTime plussTime = ofTime.plusSeconds(30);
        System.out.println("지정 시간 + 30초 = " + plussTime);
    }
}

