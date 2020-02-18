package cn.itcast01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestStu {

    public static void main(String[] args) {
        ArrayList<Student> ss = new ArrayList<>();

        Student tom = new Student("tom", 12);
        Student jerry = new Student("jerry", 12);
        Student 张三 = new Student("张三", 12);
        Student 李四 = new Student("李四", 12);

        Collections.addAll(ss, tom,jerry,张三,李四);

        for (Student s : ss) {
            if(s.getName().equals("tom")){
                ss.remove(s);
                break;
            }
        }

        System.out.println(ss);
    }
}
