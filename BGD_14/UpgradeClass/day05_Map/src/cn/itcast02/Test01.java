package cn.itcast02;

public class Test01 {


    public static void main(String[] args) {

        m1("hello", "world", "java");
        m1("hello", "mysql");
        m1("hello");
    }

    public static void m1(String... args) {
        //可变长参数本质上是定义了一个数组
        //new String[]{"hello","world","java"};
        String s = "";
        for (String str : args) {
            s += str;
        }
        System.out.println(s);
    }
}
