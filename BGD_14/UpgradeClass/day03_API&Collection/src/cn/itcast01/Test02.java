package cn.itcast01;

import java.util.ArrayList;

public class Test02 {

    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(100);//装箱
        Integer i2 = 100;

        int i3 = 100;
        int i4 = i1;

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> listc = new ArrayList<>();

        //add方法底层实际有自动装箱的操作
//        Integer x = Integer.valueOf(100);
//        Integer y = Integer.valueOf(100);
//        Integer z = Integer.valueOf(100);
//
//        list.add(x);
//        list.add(y);
//        list.add(z);

        list.add(100);
        list.add(101);
        list.add(102);

        listc.add('a');
        listc.add('b');
        listc.add('c');
    }
}
