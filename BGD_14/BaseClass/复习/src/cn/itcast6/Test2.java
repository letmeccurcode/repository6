package cn.itcast6;

import java.util.HashSet;

public class Test2 {

    public static void main(String[] args) {

        HashSet<Person> hs = new HashSet<>();

        Person p1 = new Person("tom", 13);
        Person p2 = new Person("tom", 13);

        hs.add(p1);
        hs.add(p2);

        System.out.println(hs);
    }
}
