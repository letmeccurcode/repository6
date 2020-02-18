package cn.itcast01;

public class Demo6 {

    static String name = "张三";

    public static void main(String[] args) {

        System.out.println(name);

//        System.out.println(name);
        //静态方法只能访问静态的成员

        //        m1();
        //        m2();

//        Demo6 d = new Demo6();
//        System.out.println(d.name);
        //        d.m2();
        //        d.m3();
    }


    public static void m1(){
        //        m2();
    }

    public void m2(){

        //成员方法既可以访问普通成员 也可以访问静态成员
        m1();
        m3();
    }

    public void m3(){

    }

    //无参构造方法
    public Demo6(){


    }
}
