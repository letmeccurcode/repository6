package cn.itcast9;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

/*        Comparator c = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {

                int num1 = s1.getName().compareTo(s2.getName());
                int num2 = (num1 == 0 ? s1.getAge() - s2.getAge() : num1);
                int num3 = (num2 == 0 ? s1.getScore() - s2.getScore() : num2);

                return num3;
            }
        };*/

        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2) {

                int num1 = s1.getName().compareTo(s2.getName());
                int num2 = (num1 == 0 ? s1.getAge() - s2.getAge() : num1);
                int num3 = (num2 == 0 ? s1.getScore() - s2.getScore() : num2);

                return num3;
            }
        });

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
