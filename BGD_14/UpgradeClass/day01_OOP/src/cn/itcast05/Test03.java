package cn.itcast05;

import cn.itcast04.Animal;
import cn.itcast04.Cat;
import cn.itcast04.Dog;

import java.util.Random;

public class Test03 {

    public static void main(String[] args) {

        String s = "hello";
//        System.out.println(s);

        int [] arr = new int[3];
//        System.out.println(arr);

        Random random = new Random();
//        System.out.println(random);

        Cat c = new Cat();
//        System.out.println(c);

        Animal a = new Cat();//向上转型 upcasting
        if (a instanceof  Cat){
            Cat c1 = (Cat)a;//向下转型 downcasting
            System.out.println("c1被强转成了cat类型的对象");
        }

        //强转之前判断一下是否存在继承关系

        a = new Dog();
        boolean flag = a instanceof Cat;
        System.out.println(flag);
        if(flag == true){
            Cat c2 = (Cat)a;
        }
        //instanceof 是一个运算符 用来判断当前对象和目标对象之间是否存在继承关系 或者判断当前对象是否来自于目标类型
        //建议做强制类型转换之前 先去做判断 instanceof

        System.out.println("if语句执行完毕");
        //java.lang.ClassCastException:
        //class cn.itcast04.Dog cannot be cast to class cn.itcast04.Cat


//        Dog d = (Dog)a;

//        d.lookdoor();

        //向上转型  父类型 对象名 = new 子类型();

        //如果需要访问子类特有的方法时候就需要进行强制类型转换
        //向下转型  子类型 对象名 = (目标类型)原始对象名; if(a instanceof B){}
    }
}
