package cn.itcast02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestSet2 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        set.add("张三");
        set.add("李四");
        set.add("王五");

        //无序 ≠ 随机
        for (String s : set) {
            System.out.println(s);
        }
    }
}
