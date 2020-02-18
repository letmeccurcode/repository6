package cn.itheima5;

import java.util.Random;

/**
 * 新增一个类 用来做测试
 */
public class Test01 {
//public class String {
    public static void main(String[] args) {

        /**
            int i = 10;
            int i = 10;
            int i = 10;
            int i = 10;
            int i = 10;
         */

//        数据类型 变量名 = 初始值;

        float f = 10.23f;
        char c = 'a';
        String str = "hello";
        Random r = new Random();

        System.out.println(f);
        float f1 = f + 12.34f;

        f = 34.45f;

        /*
        字面值常量
            字符串常量
            字符常量
            整数常量
            小数常量
            布尔常量
            空常量
         */
        String s = null;
        System.out.println("hello");
        System.out.println('a');
        System.out.println(10);
        System.out.println(10.23);
        System.out.println(false);
        System.out.println(s);

        //向上转型
        int x = 5;
        long y = 5;

        //向下转型
        long a = 10000000000000L;
//        int b = a;
        int b = (int) a;

        //类型之间的运算问题
//        byte/short/char -> int
        int i1 = 10;
        long i2 = 20L;
        float f3 = 30.9f;
//        long i3 = i1 + i2;
        float i3 = i1 + i2 + f3;
    }

    /**
     * @param str 执行该方法需要传入一个字符串
     * @return 方法执行完毕会返回一个int数字
     */
    public static int m1(String str){

        return 1;
    }
}
