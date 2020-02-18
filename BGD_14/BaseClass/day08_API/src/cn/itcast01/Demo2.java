package cn.itcast01;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //ctrl + 鼠标左键 进入类的源代码
        //ctrl + o 打开方法的列表
        //f -> Field属性 成员变量
        //m -> Method方法


        byte[] bs = {97};
        String s = new String(bs); // a

        String s1 = "a";

        System.out.println(s);
        System.out.println(s1);

        System.out.println(s == s1);

        //直接赋值的方式定义字符串对象 程序首先会去字符串常量池中查找是否存在 如果不存在就生成一个字符串放在常量池中并将地址值返回
        //如果再次使用直接赋值的方式定义 依然是先去查找 如果存在就直接返回该字符串的地址值
        //字符串是频繁使用的一种数据 如果一直在堆内存中创建 非常消耗资源 把字符串的定义放在常量池中能够提高程序性能

//        String
//        public class String {
//
//        }

//        public class String{
//
//        }

    }
}
