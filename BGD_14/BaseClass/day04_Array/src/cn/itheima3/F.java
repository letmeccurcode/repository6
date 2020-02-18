package cn.itheima3;

public interface F {

    public static void m1() {
        System.out.println("我是m1方法");
        common();
    }

    public static void m2() {
        System.out.println("我是m2方法");
        common();
    }
/*
    private static void common(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/

    public static void common(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
/*
    public default void common() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    //普通私有方法
    //静态私有方法
    */
}
