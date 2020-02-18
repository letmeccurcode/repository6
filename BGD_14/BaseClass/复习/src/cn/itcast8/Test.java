package cn.itcast8;

import java.util.TreeSet;

public class Test{

    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<>(new StuComparator());

        Student s1 = new Student("albort", 12, 99);
        Student s2 = new Student("albort", 11, 100);
        Student s3 = new Student("bob", 5, 88);
        Student s4 = new Student("bob", 5, 77);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student t : ts) {
            System.out.println(t);
        }
    }
}
