package cn.itcast03_comparator_定义子类;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {

        //创建比较器对象
        UserComparator uc = new UserComparator();
        //使用有参构造创建TreeSet集合
        TreeSet<User> set = new TreeSet<>(uc);

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
    }
}
