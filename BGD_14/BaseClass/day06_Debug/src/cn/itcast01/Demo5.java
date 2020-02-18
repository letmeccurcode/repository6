package cn.itcast01;

public class Demo5 {

    public static void main(String[] args) {

        String s = "";

        /*for (int start = 65;start <= 90;start++){
            s += (char)start;
        }*/

        //循环中的初始化语句可以定义为多个
        for (char upper = 'A', lower = 'a'; upper <= 'Z'; upper++, lower++) {
            s += upper;
            s += lower;
            //alt + shift + r 重命名
        }

        System.out.println(s);

    }
}
