package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2028, 1, 9, 14, 49, 30);
        System.out.println("현재 날짜시간 = " + nowDt);
        System.out.println("지정 날짜시간 = " + ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime plusDays = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간 + 1000일 = " + plusDays);
        LocalDateTime plusYears = ofDt.plusYears(10);
        System.out.println("지정 날짜시간 + 10년 = " + plusYears);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간 보다 과거인가? = " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간 보다 미래인가? = " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간이 동일한가? = " + nowDt.isEqual(ofDt));
    }
}

