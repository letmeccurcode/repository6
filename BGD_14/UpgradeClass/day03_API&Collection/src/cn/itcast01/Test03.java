package cn.itcast01;

import java.util.Date;

public class Test03 {

    public static void main(String[] args) {

//        Character
        char c = 'a';
        char c1 = '0';
        /*
        if (c >= '0' && c <= '9'){

        }*/

//        Character.isLetter(char c); 判断字符c是否是字母
//        Character.isDigit(char c); 判断字符c是否是数字

        boolean flag1 = Character.isLetter(c);
        boolean flag2 = Character.isDigit(c1);

        System.out.println(flag1);
        System.out.println(flag2);

        Date date = new Date();

        System.out.println(date.getTime() / 1000 / 60 / 60 / 24 / 365);

        date.setTime(1000 * 60 * 60);

        //根据一个人的出生年月日  计算出他出生了多少天 2020 01 03 -> 三天
        //1990 12 12 -> ?




    }
}
