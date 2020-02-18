package cn.itcast05;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.show();
        s2.show();

        //静态代码块是类加载的时候执行 且只执行一次

        //成员代码块 在构造方法调用之前执行 每调用一次构造方法成员代码块都会执行一次

//        s1.setName("tom");
//        s1.setAge(3);
//        System.out.println(s1.getAge());
//        System.out.println(s1.getName());
//
//        Student s2 = new Student("jerry", 2);
//
//        System.out.println(s2.getName());
//        System.out.println(s2.getAge());
    }
}
