package cn.itcast02;


import java.io.Serializable;

public class A extends Object{
//如果一个类没有显性的继承某个类 那么它默认继承Object类
    public int num = 10;//40

//    String
//public class String {
    public A(){
//        super();//调用Object类的无参构造方法
        System.out.println("A的无参构造方法执行了");
    }

    public A(int num){
        this.num = num;
        System.out.println("A的有参构造方法执行了");
    }

    public void m1(){
        System.out.println("A类中的m1方法执行了");
    }
}
