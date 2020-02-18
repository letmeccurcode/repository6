package cn.itcast02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("hello1");
        set.add("hello2");
        set.add("hello3");

//        System.out.println(set);

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String s : set) {
            System.out.println(s);
        }

//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.get(i));
//        }
    }
}
