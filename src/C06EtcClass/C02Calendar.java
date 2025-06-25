package C06EtcClass;

import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
//        java.util패키지의 Calendar클래스
        Calendar myCalendar = new Calendar() {
            @Override
            protected void computeTime() {
                
            }

            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(int field) {
                return 0;
            }
        }
    }
}
