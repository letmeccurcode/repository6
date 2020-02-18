package cn.itcast02;

import java.util.HashSet;

public class TestSet4 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set2.add("hello");
        set2.add("hello");
        set2.add("hello2");

        for (String s : set2) {
            System.out.println(s);
        }

        set.add(100);
        set.add(100);
        set.add(100);
        set.add(101);
        set.add(102);

        for (Integer integer : set) {
            System.out.println(integer);
        }
        //        for (int i : set) {
        //            System.out.println(i);
        //        }

        //自定义的引用类型 class 如果将来要存储到集合中并且达到去重的效果
        //就必须重写这两个方法hashcode equals方法
    }
}
