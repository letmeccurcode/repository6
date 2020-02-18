package cn.itcast02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

public class Test02 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birth = "1992-10-01";

        Date date = sdf.parse(birth);
        Student tom = new Student("tom", 12, date);

        System.out.println(tom);

//        Collections.sort();

    }
}
