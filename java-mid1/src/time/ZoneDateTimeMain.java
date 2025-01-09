package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("now = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2028, 12, 28, 9, 12, 30);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);
        ZonedDateTime zdt2 = ZonedDateTime.of(2028, 12, 28, 9, 12, 30, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utc = nowZdt.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " + utc);
    }
}
