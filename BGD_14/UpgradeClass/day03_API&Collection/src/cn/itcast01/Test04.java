package cn.itcast01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日:格式-> 年-月-日");
        String birth = sc.next();

        //1 获取1970年 - 2020年之间的时间总毫秒值     A
//        Date nowtime = new Date();
//        long total = nowtime.getTime();
        long total = new Date().getTime();
        //2 获取1970年 - 生日年份之间的时间总毫秒值    B
        //把字符串生日 -> Date对象 SimpleDateFormat -> parse();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date birthDate = sdf.parse(birth);
        long birthTime = sdf.parse(birth).getTime();
        //3 A - B 就是生日年份 - 当前2020之间的时间总毫秒值
        long birthMillis = total - birthTime;
        long days = birthMillis / 1000 / 60 / 60 / 24;
        System.out.println("出生了" + days + "天");
//        System.out.println(birthMillis);

    }
}
