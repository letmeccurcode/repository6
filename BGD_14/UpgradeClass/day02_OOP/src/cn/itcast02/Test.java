package cn.itcast02;

import cn.itcast.Animal;
import cn.itcast.Cat;
import cn.itcast.Dog;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //A a = new A();
        //接口多态
        A a = new B();
        //父接口名 = new 子实现类();

//        show(new Random());
//        show(new Cat());

//        show2(new Dog());
//        show2(new Cat());

        System.out.println("hello");
        System.out.println(new Random());
        System.out.println(new Cat());
        System.out.println(new Scanner(System.in));
        //如果方法的参数列表定义的是一个普通类,那么我们可以传入该类的实例或者该类的子类实例

        String s = "helloworldjava";
        String replace = s.replace("o", "x");
        //replace方法的参数列表是接收两个接口 那我们调用该方法时要传入CharSequence的子实现类 String
        System.out.println(replace);
    }

    public static ArrayList<String> getList() {
//        ArrayList<Object> list = new ArrayList<>();
        return new ArrayList<>();//匿名对象
    }

    public static void show(Cat c) {

    }

    public static Animal show2(Animal a) {
//        Inner inner = new Inner();
        return new Cat();
    }

    static int x = 10;

    public static void show3(){

        //方法的局部变量不能使用public/private修饰符 没有任何意义

        int i = 10;
        System.out.println(i);
        class Inner{

            public void print(){
                System.out.println(i);
                System.out.println(x);

            }
        }
        System.out.println(i);
        Inner inner = new Inner();
    }
}
