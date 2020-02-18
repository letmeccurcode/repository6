package cn.itcast01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        //指定集合存储的数据类型 泛型约束
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Object> list2 = new ArrayList<>();

        //public class 类名<>

        list2.add("halo");
        list2.add(1);
        list2.add(false);

        list2.add(new Random());

/*        for (Object o : list2) {
            if (o instanceof String) {
                String o1 = (String) o;
            }
            if (o instanceof Integer) {
                Integer o1 = (Integer) o;
            }
            if (o instanceof Boolean) {
                Boolean o1 = (Boolean) o;
            }
            if (o instanceof Random) {
                Random o1 = (Random) o;
            }
        }*/

//        list.add("halo");
//        String s = list.get(0);
//        s.length();
//        ArrayList<Object> list2 = new ArrayList<>();
//
//        list2.add("halo");
//
//        Object o = list2.get(0);
//        String o1 = (String) o;
//        o1.length();


//        list.add(1);

        //泛型类 泛型接口 泛型方法

        //泛型方法是在调用方法传递参数的时候才确定接收何种类型
        m1("hallo");
    }

    public static <T> void m1(T t) {

//        Comparator
//        Comparable
        System.out.println(t);
    }
}
