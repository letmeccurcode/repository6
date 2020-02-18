package cn.itcast03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Test02 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "java","hello","python","c++");

        System.out.println(list);

//        Collections.sort();
        String s = "ab";
        m1(s);
        System.out.println(s);
    }

    public static void m1(String s){

        System.out.println(s);
        s = "ef";
        System.out.println(s);
    }
}
