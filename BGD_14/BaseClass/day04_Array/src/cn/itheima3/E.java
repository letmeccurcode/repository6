package cn.itheima3;

public interface E {

    public default void m1() {
        System.out.println("我是m1方法");
        common();
    }

    public default void m2() {
        System.out.println("我是m2方法");
        common();
    }
/*
    private static void common(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/

    private void common(){
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
