package cn.itcast;

public class Test4 {

    public static void main(String[] args) {

//        int i = m1();
        System.out.println(m1());

        m2();
//        System.out.println(m2());

        System.out.println(m3(2, 4));

        m4("hello world!");
    }

    public static int m1() {

        return 1;
    }

    public static void m2() {
        System.out.println("m2方法执行了");

        m4("hello");
    }

    public static int m3(int x, int y) {
        return x + y;
    }

    public static void m4(String s) {
        System.out.println(s);
        int i = m3(1, 3);
    }
}
