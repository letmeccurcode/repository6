package cn.itcast5;

public class Test {

    public static void main(String[] args) {

        new A(){
            @Override
            public void m1() {
                System.out.println("抽象类A的子类对象中的m1方法执行了!");
            }
        };

        A a = new A(){
            @Override
            public void m1() {
                System.out.println("抽象类A的子类对象中的m1方法执行了!");
            }
        };

        a.m1();
        a.m1();

        new B(){
            @Override
            public void m2() {
                System.out.println("接口B的子实现类对象中的m2方法执行了!");
            }
        }.m2();

        B b = new B(){
            @Override
            public void m2() {
                System.out.println("接口B的子实现类对象中的m2方法执行了!");
            }
        };
        b.m2();
        b.m2();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("run方法执行了!");
            }
        };

        new Thread(r).start();
    }
}
