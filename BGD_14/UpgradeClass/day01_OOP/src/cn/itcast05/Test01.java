package cn.itcast05;

public class Test01 {

    static {

    }

    String s = "hellojava";

    public static void main(String[] args) {

        int r = 5;

//        double π = 3.1415926;

        double mj = Math.PI * (r * r);

        int i = Math.abs(10 - 20);

        //使用工具类的正确方式:类名.方法名();/类名.属性名

//        Math math = new Math();

//        JDBCutils u = new JDBCutils();
//        u.m1();

        JDBCutils.m1();

//        System.out.println(s);

        Test01 t = new Test01();

        t.m2();
//        System.out.println(t.s);

        m1();

//        m2();

//        this.m2();

//        super.clone();
    }

    public static void m1(){

    }

    public void m2(){
        System.out.println("m2方法被执行了");
    }

    //静态方法中不允许出现对象相关的关键字 this/super

    //静态成员只能访问静态成员
    //普通成员方法能访问静态方法也可以访问非静态方法
}
