package cn.itcast03;

import cn.itcast04.Cat;

public class Test {

    public static void main(String[] args) {

        Cat c = new Cat();

        B b = new B();


//        StringBuffer sb = new StringBuffer();

//        访问本类的成员变量     访问父类中的成员变量
//          this.变量名            super.变量名

//        访问本类的成员方法     访问父类中的成员方法
//          this.方法名();         super.方法名();

//        访问本类的构造方法     访问父类中的构造方法
//          this();                super();


        //范围:在具有继承/实现关系的父子类之间
        //父类中的方法不能满足子类的需求 子类就可以对该方法进行重写
        //1 方法的声明必须和父类的方法一致
        //2 方法体不同
        //3 使用@Override
        //4 方法的重写只针对成员方法 构造方法/静态方法是没有方法的重写
        //5 方法重写的修饰符只能比原有的方法更高不能更低 最少得平级

        b.print();
    }
}
