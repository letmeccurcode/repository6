package cn.itcast02;

import java.io.Serializable;
import java.util.TreeSet;

public class TestSet5 {

    public static void main(String[] args) {

//        Integer
        TreeSet<Character> set = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();

//      String Comparable<String>
//      Character  Comparable<Character>
//      Integer Comparable<Integer>

        set2.add("hello");
        set2.add("hallo");
        set2.add("hi");

        for (String s : set2) {
            System.out.println(s);
        }

        set.add('z');
        set.add('b');
        set.add('m');
        set.add('x');

        for (Character c : set) {
            System.out.println(c);
        }
    }
}
