package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
//        java.util패키지의 Calendar클래스
//        Calendar myCalendar = Calendar.getInstance();
//        System.out.println(myCalendar.getTime());
//        System.out.println(myCalendar.get(Calendar.YEAR));
//        System.out.println(myCalendar.get(Calendar.MONTH)+1);
//        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK)); // 요일
//        System.out.println(myCalendar.get(Calendar.DAY_OF_MONTH)); // 날짜
//        System.out.println(myCalendar.get(Calendar.HOUR_OF_DAY)); // 날짜
//        System.out.println(myCalendar.get(Calendar.MINUTE)); // 날짜
//        System.out.println(myCalendar.get(Calendar.SECOND)); // 날짜

//        java.time 패키지의 LocalDateTime, LocalDate, LocalTime 클래스
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.get(ChronoField.YEAR));
    }
}
