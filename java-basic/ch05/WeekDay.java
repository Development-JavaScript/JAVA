package ch05;

import java.util.Calendar;

public class WeekDay {
    public static void main(String[] args) {
        // Week 열거 타입 변수 선언
        Week today = null;
        // Calender 얻기
        Calendar calendar = Calendar.getInstance();
        //오늘 요일 얻기 (일(1) ~ 토(7)까지의 숫자를 얻고  week 변수에 대입)
        int week = calendar.get(Calendar.DAY_OF_WEEK);

        switch (week){
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        if(today == Week.SUNDAY){
            System.out.println("스프링을 공부할 요일 입니다.");
        }else {
            System.out.println("자바를 공부할 요일 입니다.");
        }
        System.out.println(today);

    }
}
