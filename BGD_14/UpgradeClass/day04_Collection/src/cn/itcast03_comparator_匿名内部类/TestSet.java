package cn.itcast03_comparator_匿名内部类;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {

        //数据类型 变量名 = new 对象();

//        Comparator com = new Comparator(){
//
//            @Override
//            public int compare(Object o, Object t1) {
//                return 0;
//            }
//        };
//
//        TreeSet treeSet = new TreeSet<>(com);

        //通过TreeSet集合的有参构造实例化
        TreeSet<User> set = new TreeSet<>(
                new Comparator<User>() {
                    //new 接口名(){
                    //  实现接口中的抽象方法
                    // }
                    @Override
                    public int compare(User user1, User user2) {
                        String sname1 = user1.getName();
                        String sname2 = user2.getName();

                        int sage1 = user1.getAge();
                        int sage2 = user2.getAge();

                        String pswd1 = user1.getPassword();
                        String pswd2 = user2.getPassword();

                        int num1 = sname1.compareTo(sname2);
                        int num2 = (num1 == 0 ? sage2 - sage1 : num1);
                        int num3 = (num2 == 0 ? pswd1.compareTo(pswd2) : num2);
                        return num3;
                    }
                }
        );
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
