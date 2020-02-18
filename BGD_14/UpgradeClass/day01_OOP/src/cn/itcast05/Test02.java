package cn.itcast05;

import cn.itcast04.Animal;
import cn.itcast04.Cat;

public class Test02 {

    public static void main(String[] args) {

        Chinese tom = new Chinese("tom", 5);
        Chinese jerry = new Chinese("jerry", 4);
        Chinese zs = new Chinese("张三", 43);

//        System.out.println(tom.country);
//        System.out.println(jerry.country);
//
//        System.out.println(Chinese.country);
//        System.out.println(tom.country);
//        System.out.println(jerry.country);

//        tom.country = "USA";
//        jerry.country = "UK";
//
//        System.out.println(tom.country);
//        System.out.println(jerry.country);


        Cat c = new Cat();

        //父类型引用 子类型对象
        Animal a = new Cat();

//        Animal a1 = new Animal();
        Object obj = new Animal();

        Object obj2 = new String();

        //1 有继承关系
        //2 有方法的重写(这是多态的意义所在)
        //3 有父类型的引用指向子类型对象

//        Cat c1 = new Cat();
//        m1(a);
//        m1(c1);
        //编译看左 运行看左
        Animal animal = new Cat();
        System.out.println(animal.age);
        //编译看左 运行看右
        animal.eat();

        m1(animal);
    }

    public static void m1(Animal a){
        a.eat();//调用cat类中的eat方法
    }
}
