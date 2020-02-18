package cn.itcast7;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("albert", 12, 90);
        Student s2 = new Student("abs", 11, 99);
        Student s3 = new Student("bob", 6, 98);
        Student s4 = new Student("bob", 9, 88);
        //1 让Student类实现comparable接口 重写compareto方法

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
