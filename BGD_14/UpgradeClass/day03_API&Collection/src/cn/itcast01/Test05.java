package cn.itcast01;

import java.util.Calendar;

public class Test05 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

//        int month = calendar.get(calendar.MONTH)+1;
        int month = calendar.get(calendar.MONTH);
        System.out.println(month);

//        add/set/get
//        calendar.set(, , );
    }
}
