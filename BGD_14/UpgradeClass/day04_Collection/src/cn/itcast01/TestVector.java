package cn.itcast01;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class TestVector {

    public static void main(String[] args) {

//        HashSet<String> set = new HashSet<>();
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
//        CopyOnWriteArraySet
        set.add("hello");
        set.add("java");
        set.add("jdk");

        for (String s : set) {
            if (s.equals("java")){
                set.add("c++");
            }
        }
        System.out.println(set);

        Vector<String> vector = new Vector<>();

        vector.add("hello1");
        vector.add("hello2");
        vector.add("hello3");
        vector.add("hello4");

        for (String s : vector) {
            System.out.println(s);
        }

        ListIterator<String> it = vector.listIterator();
        while (it.hasNext()) {
            it.next();
        }

        Collection<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        // ArrayList能做的事 Vector也能做
        // Vector是线程安全的 效率低
        // ArrayList是线程不安全 效率高

        // StringBuilder
        // StringBuffer
    }
}
