package cn.itcast06;

public class B extends A {
    public int num = 20;

    @Override
    public void m1(){
        System.out.println("B类中的成员方法m1执行了");
    }

    public void m2(){
        System.out.println("B类中的成员方法m2执行了");
    }
}
