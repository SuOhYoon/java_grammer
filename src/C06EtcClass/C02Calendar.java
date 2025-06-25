package C06EtcClass;

import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
//        java.util패키지의 Calendar클래스
        Calendar myCalendar = Calendar.getInstance();
        System.out.println(myCalendar.getTime());
        System.out.println(myCalendar.get());
    }
}
