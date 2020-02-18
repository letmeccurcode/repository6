package cn.itcast01;

import java.util.ArrayList;

public class Demo2
{

    public static void main(String[] args) {

        //ArrayList是一个能够存储元素的容器 长度可以扩展 只能存放引用数据类型 不能存放基本数据类型

//        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list = new ArrayList<String>();

        //添加
        list.add("halo");
        list.add("java");
        list.add("world");

        list.add(1, "python");

        //移除
        String s1 = list.remove(0);
        System.out.println(s1);//halo

        boolean flag1 = list.remove("java");
        boolean flag2 = list.remove("javase");

        System.out.println(flag1);
        System.out.println(flag2);

        //获取

        String s2 = list.get(1);
        System.out.println(s2);

        //修改

        list.set(0, "mysql");

        //size

        System.out.println(list.size());

        System.out.println(list);
    }
}
