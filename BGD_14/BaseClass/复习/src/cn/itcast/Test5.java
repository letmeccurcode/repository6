package cn.itcast;

public class Test5 {

    public static void main(String[] args) {
        String s = "hellojava";

        System.out.println("main执行前:" + s);//hellojava

        changeStr(s);

        System.out.println("main执行后:" + s);//hellojava

    }

    public static void changeStr(String s) {
        System.out.println("change执行前:" + s);//hellojava
        s += "123456";
//        s = s + "123456"
        System.out.println("change执行后:" + s);//hellojava123456
    }
}
