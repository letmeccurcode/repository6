package cn.itcast04_comparable_泛型类实现comparable接口;

import cn.itcast02.User;

import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        //通过TreeSet集合的无参构造实例化 那么泛型类必须实现comparable接口
        TreeSet<User> set = new TreeSet<>();

        User u1 = new User("tom", 3, "123");
        User u2 = new User("jerry", 2, "321");
        User u3 = new User("tom", 1, "123");
        User u4 = new User("tom", 4, "456");
        User u5 = new User("tom", 3, "1234");
        User u6 = new User("tom", 2, "4321");

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);
        set.add(u6);

        for (User user : set) {
            System.out.println(user);
        }

/*
        private transient NavigableMap<E, Object> m;

        TreeSet(NavigableMap<E, Object> m) {
            this.m = m;
        }

        public TreeSet() {
            this((NavigableMap)(new TreeMap()));
        }

        this(参数)表示调用当前类的另一个带参构造
        (NavigableMap)目标类型(new TreeMap()原始对象)
        */
    }
}
