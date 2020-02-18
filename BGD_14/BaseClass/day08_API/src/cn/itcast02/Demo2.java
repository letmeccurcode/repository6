package cn.itcast02;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        //        校验qq号码.
        //        1:要求必须是5-15位数字
        //        2:0不能开头

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个qq号:");

        String q = sc.next();
        boolean flag = checkQQ(q);
        System.out.println(q + (flag == true ? "是一个qq号" : "不是一个qq号"));

        System.out.println("D:\\d");//    \\表示一个\

    }

    private static boolean checkQQ(String q) {

        return q.matches("[1-9][0-9]{4,14}");
        //[1-9] [0-9] {4,14}
    }

    //定义方法 完成对qq号码的校验 如果满足要求 返回true 否则返回false

/*    public static boolean checkQQ(String qq) {
        boolean flag = true;

        //判断长度
        int len = qq.length();
        if (len >= 5 && len <= 15) {

            //判断首字符 是否为0
            if (qq.startsWith("0")) {
                flag = false;
            } else {
                //判断qq号是否存在非数字字符
                for (int i = 0; i < qq.length(); i++) {
                    char ch = qq.charAt(i);
                    if (!(ch >= '0' && ch <= '9')) {
                        flag = false;
                        break;
                    }
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }*/
}
